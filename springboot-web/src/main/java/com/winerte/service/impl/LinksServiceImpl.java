package com.winerte.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winerte.mapper.LinksMapper;
import com.winerte.model.Links;
import com.winerte.service.ILinksService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 链接信息表 服务实现类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
@Service
public class LinksServiceImpl extends ServiceImpl<LinksMapper, Links> implements ILinksService {

}
