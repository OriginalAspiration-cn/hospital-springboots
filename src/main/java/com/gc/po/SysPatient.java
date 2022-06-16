package com.gc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class SysPatient implements Serializable {
    /**
     * 病人信息id
     */
    private Integer id;

    /**
     * 所在科室id
     */
    private Integer departmentId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String year;

    /**
     * 性别(0未知 1男 2女)
     */
    private Byte sex;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 住址
     */
    private String address;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 住院编号
     */
    private String hospitalNumber;

    /**
     * 过敏史(0未知1是2否)
     */
    private Byte allergy;

    /**
     * 入院时间
     */
    private Date admissionTime;

    /**
     * 住院床号
     */
    private String bedNumber;

    /**
     * 出院时间
     */
    private Date bischargeTime;

    private static final long serialVersionUID = 1L;

}