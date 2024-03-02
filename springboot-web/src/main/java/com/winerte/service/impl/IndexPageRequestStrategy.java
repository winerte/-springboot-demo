package com.winerte.service.impl;

import com.winerte.dto.PostsPageQueryParam;
import com.winerte.model.Site;
import com.winerte.service.ILearnWebRequestStrategy;
import com.winerte.service.IPostsService;
import com.winerte.service.ISiteService;
import com.winerte.service.ITermTaxonomyService;
import com.winerte.state.PostStatus;
import com.winerte.util.WebRequestParam;
import com.winerte.vo.PostsVo;
import com.winerte.vo.SiteVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页请求处理策略
 */
@Service("indexPageRequestStrategy")
public class IndexPageRequestStrategy implements ILearnWebRequestStrategy {
    private static final String INDEX_PAGE = "index.html";
    /**
     * 站点栏目内容信息
     */
    private static final String INDEX_TERM_TAXONOMY_POST_VO = "indexTermTaxonomyPostVo";
    /**
     * 站点信息
     */
    private static final String SITE_CONFIG = "siteConfig";
    
    /**
     * 文章分页列表
     */
    private static final String POSTS_ITEMS = "postsItems";
    /**
     * 、文章条数（前端列表暂时没用上）
     */
    private static final String POSTS_TOTAL= "postsTotal";
    @Autowired
    private ISiteService siteService;
    @Autowired
    private ITermTaxonomyService termTaxonomyService;
    @Autowired
    private IPostsService postsService;

    @Override
    public String handleRequest(WebRequestParam webRequestParam) {

        List<Site> siteList = siteService.list();
        //处理站点配置
        if(siteList.size() > 0) {
            Site site = siteList.get(0);
            SiteVo siteVo = new SiteVo();
            BeanUtils.copyProperties(site, siteVo);
            webRequestParam.getRequest().setAttribute(SITE_CONFIG, siteVo);
        }

        PostsPageQueryParam pageQueryParam = new PostsPageQueryParam();
        pageQueryParam.setPage(webRequestParam.getPage());
        pageQueryParam.setAsc(webRequestParam.isAsc());
        pageQueryParam.setOrderBy(webRequestParam.getOrderBy());
        pageQueryParam.setPageSize(webRequestParam.getPageSize());
        pageQueryParam.setPostStatus(PostStatus.PUBLISHED.toString());
        pageQueryParam.setTermTaxonomyId(webRequestParam.getChannelId());

        List<PostsVo> pageVoList = postsService.findByPageWithTagPaged(pageQueryParam);
        webRequestParam.getRequest().setAttribute(POSTS_ITEMS, pageVoList);
        return INDEX_PAGE;
    }
}
