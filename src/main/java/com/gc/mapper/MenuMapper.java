package com.gc.mapper;


import com.gc.po.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MenuMapper {
    /**
     * 根据id查菜单名
     * @param
     * @return
     */
    List<SysMenu> menu();
}
