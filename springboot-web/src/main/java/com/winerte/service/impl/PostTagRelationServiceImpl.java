package com.winerte.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winerte.mapper.PostTagRelationMapper;
import com.winerte.model.PostTagRelation;
import com.winerte.service.IPostTagRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签文章关系表 服务实现类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
@Service
public class PostTagRelationServiceImpl extends ServiceImpl<PostTagRelationMapper, PostTagRelation> implements IPostTagRelationService {

}
