package com.gc.service;

import com.gc.vo.MenuVo;

import java.util.List;

public interface MenuService {
    /**
     * 根据菜单id查菜单名
     * vo里面放子菜单集合
     * @param
     * @return
     */
    List<MenuVo> MenuVo();
}
