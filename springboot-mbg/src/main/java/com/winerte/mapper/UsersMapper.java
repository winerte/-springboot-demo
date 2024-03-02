package com.winerte.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.winerte.dto.UsersPageQueryParam;
import com.winerte.model.Users;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
public interface UsersMapper extends BaseMapper<Users> {
    IPage<Users> findByPage(IPage<Users> page, @Param(Constants.WRAPPER) Wrapper<UsersPageQueryParam> wrapper);
}
