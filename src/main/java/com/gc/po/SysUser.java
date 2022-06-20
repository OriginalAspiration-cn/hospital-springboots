package com.gc.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements Serializable {
    /**
     * 用户id
     */
    private int id;

    /**
     * 所属科室id
     */
    private Integer departmentId;

    /**
     * 职务id
     */
    private Integer positionId;

    /**
     * 级别id(可查看信息多少的权限级别划分)
     */
    private Integer rankId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String code;

    /**
     * 头像
     */
    private String portrait;

    /**
     * 姓名
     */
    private String name;

    /**
     * 工作ID号
     */
    private String work;

    /**
     * 年龄
     */
    private String year;

    /**
     * 性别(0未知 1男 2女)
     */
    private Byte sex;

    /**
     * 工龄
     */
    private String seniority;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

}