package com.winerte.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winerte.mapper.SiteMapper;
import com.winerte.model.Site;
import com.winerte.service.ISiteService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 站点 服务实现类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
@Service
public class SiteServiceImpl extends ServiceImpl<SiteMapper, Site> implements ISiteService {

}
