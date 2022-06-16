package com.gc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class SysCheckout implements Serializable {
    /**
     * 检验信息id
     */
    private Integer id;

    /**
     * 检验执行者id
     */
    private Integer checkoutPerformerId;

    /**
     * 检验类型id(检验类型表)
     */
    private Integer checkoutTypeId;

    /**
     * 检验信息ID
     */
    private String checkout;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 病人编号
     */
    private String patientCoding;

    /**
     * 检验结果
     */
    private String checkoutResult;

    /**
     * 检验状态
     */
    private Byte checkoutState;

    /**
     * 检验时间
     */
    private Date checkoutTime;

}