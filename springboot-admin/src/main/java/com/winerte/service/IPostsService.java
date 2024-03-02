package com.winerte.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.winerte.dto.PostsPageQueryParam;
import com.winerte.dto.PostsParam;
import com.winerte.model.Posts;
import com.winerte.vo.PostsVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 文章 服务类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
public interface IPostsService extends IService<Posts> {
    /**
     * 保存内容
     * @param postsParam
     * @return
     */
    void savePosts(PostsParam postsParam);

    /**
     * 修改内容
     * @param postsParam
     * @return
     */
    void updatePosts(PostsParam postsParam);

    /**
     * 定时发布文章后调用
     *
     * @param postId
     */
    boolean updatePostByScheduler(Long postId);

    boolean removePostsById(Long id);


    IPage<PostsVo> findByPage(PostsPageQueryParam postsPageQueryParam);

    PostsVo getPostsById(Long id);

    int  insertPostTermTaxonomy(Long[] postsIds, Long[] termTaxonomyIds);

    String uploadMd(MultipartFile file);

    /**
     * 置顶/取消置顶方法
     * @param postsId 文章id
     * @param flag 标志位：0-不置顶；1-置顶
     */
    void setOnTop(Long postsId, Integer flag);
}
