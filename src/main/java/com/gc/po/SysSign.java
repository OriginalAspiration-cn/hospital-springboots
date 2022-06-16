package com.gc.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 
 */
public class SysSign implements Serializable {
    /**
     * 体征信息id
     */
    private Integer id;

    /**
     * 体检执行者id
     */
    private Integer signPerformerId;

    /**
     * 体征信息ID
     */
    private String sign;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 病人编号
     */
    private String patientCoding;

    /**
     * 身高
     */
    private BigDecimal stature;

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 血压
     */
    private String bloodPressure;

    /**
     * 脉搏
     */
    private String pulse;

    /**
     * 体温
     */
    private BigDecimal animalHeat;

    /**
     * 体检时间
     */
    private Date examinationTime;

    private static final long serialVersionUID = 1L;

}