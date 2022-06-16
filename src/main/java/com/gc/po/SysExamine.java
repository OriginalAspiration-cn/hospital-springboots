package com.gc.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 
 * 
 */
public class SysExamine implements Serializable {
    /**
     * 检查信息id
     */
    private Integer id;

    /**
     * 检查执行者id
     */
    private Integer examinePerformerId;

    /**
     * 检查类型id(检查类型表)
     */
    private Integer examineTypeId;

    /**
     * 检查信息ID
     */
    private String examine;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 病人编号
     */
    private String patientCoding;

    /**
     * 检查结果
     */
    private String examineResult;

    /**
     * 检查状态
     */
    private Byte examineState;

    /**
     * 检查时间
     */
    private Date examineTime;

    private static final long serialVersionUID = 1L;


}