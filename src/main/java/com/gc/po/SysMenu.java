package com.gc.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SysMenu implements Serializable {
    /**
     * 菜单id
     */
    private Integer id;

    /**
     * 父菜单id(0表示是根菜单)
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单图标
     */
    private String menuIcon;

    /**
     * 菜单url
     */
    private String menuUrl;

    /**
     * 菜单类型(1目录 2页面 3按钮)
     */
    private Byte menuType;

    /**
     * 菜单状态(0禁用 1启用)
     */
    private Byte menuStatus;

    /**
     * 权限标识
     */
    private String authorize;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;


}