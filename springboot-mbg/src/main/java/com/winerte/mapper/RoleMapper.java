package com.winerte.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.winerte.dto.RolePageQueryParam;
import com.winerte.model.Menu;
import com.winerte.model.Resource;
import com.winerte.model.Role;
import com.winerte.vo.RoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @author 石磊
 * @since 2022-03-03
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据后台用户ID获取菜单
     */
    List<Menu> getMenuList(@Param("usersId") Long usersId);
    /**
     * 根据角色ID获取菜单
     */
    List<Menu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<Resource> getResourceListByRoleId(@Param("roleId") Long roleId);
    /**
     * 
     * @param page
     * @param wrapper
     * @return
     */
    IPage<RoleVo> findByPage(IPage<RoleVo> page, @Param(Constants.WRAPPER) Wrapper<RolePageQueryParam> wrapper);
}
