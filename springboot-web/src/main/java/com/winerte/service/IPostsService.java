package com.winerte.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.winerte.dto.PostsPageQueryParam;
import com.winerte.model.Posts;
import com.winerte.vo.PostsVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 文章 服务类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
public interface IPostsService extends IService<Posts> {

    IPage<PostsVo> findByPageWithTag(PostsPageQueryParam postsPageQueryParam);

    List<PostsVo> findByPageWithTagPaged(PostsPageQueryParam postsPageQueryParam);

    List<Posts> listByTermTaxonomyId(Long termTaxonomyId);

    PostsVo getPostsById(Long id);

    void increasePageView(Long id, HttpServletRequest  request);

    void increaseLikeCount(Long id, HttpServletRequest  request);

    int getPageView(Long id);

    int getLikeCount(Long id);

    Boolean hasClickedLike(Long id, HttpServletRequest request);

}
