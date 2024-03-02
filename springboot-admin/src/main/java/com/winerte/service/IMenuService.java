package com.winerte.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.winerte.dto.MenuNode;
import com.winerte.model.Menu;

import java.util.List;

/**
 * <p>
 * 后台菜单表 服务类
 * </p>
 *
 * @author 石磊
 * @since 2022-03-03
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 树形结构返回所有菜单列表
     */
    List<MenuNode> treeList();

}
