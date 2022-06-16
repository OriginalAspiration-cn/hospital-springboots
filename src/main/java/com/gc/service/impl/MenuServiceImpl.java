package com.gc.service.impl;

import com.gc.mapper.MenuMapper;
import com.gc.po.SysMenu;
import com.gc.service.MenuService;
import com.gc.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {
   
    private MenuMapper Menu;
    @Autowired
    public MenuServiceImpl(MenuMapper Menu){
        this.Menu=Menu;
    }
    @Override
    public List<MenuVo> MenuVo(){
        //调用dao查询角色对应的菜单
        List<SysMenu> thisMenuDao=this.Menu.menu();
        return dealMenuTableTreeVoList(thisMenuDao,0);
    }

    /**
     * 把List<SysMenu> 转换为 +<MenuVo>
     * @param listSource SysMenu数据
     * @param pid 形式参数  （父id）
     * @return
     */
    private List<MenuVo> dealMenuTableTreeVoList(List<SysMenu> listSource, int pid) {
        List<MenuVo> rList = new ArrayList<>();
        MenuVo menuTableTreeVo;
        for (SysMenu menu : listSource) {
            if (menu.getParentId() == pid) {
                menuTableTreeVo = new MenuVo();
                //复制SysMenu到MenuTableTreeVo
                menuTableTreeVo.setId(menu.getId());
                menuTableTreeVo.setParentId(menu.getParentId());
                menuTableTreeVo.setMenuName(menu.getMenuName());
                menuTableTreeVo.setMenuUrl(menu.getMenuUrl());
                menuTableTreeVo.setMenuIcon(menu.getMenuIcon());

                //菜单类型(1目录 2页面)
                if (menu.getParentId()<3){
                    //1目录 2页面 查找子节点
                    List<MenuVo> childList=dealMenuTableTreeVoList(listSource,menu.getId());
                    menuTableTreeVo.setSonMenuSet(childList);
                }else {
                    //3按钮 无子节点
                    menuTableTreeVo.setSonMenuSet(null);
                }
                //menuTableTreeVo 添加到list
                    rList.add(menuTableTreeVo);
            }
        }
        return rList;
    }

}
