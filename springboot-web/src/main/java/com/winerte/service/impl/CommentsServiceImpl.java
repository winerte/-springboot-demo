package com.winerte.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winerte.mapper.CommentsMapper;
import com.winerte.model.Comments;
import com.winerte.service.ICommentsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
