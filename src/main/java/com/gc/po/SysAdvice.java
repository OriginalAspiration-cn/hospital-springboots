package com.gc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class SysAdvice implements Serializable {
    /**
     * 医嘱信息id
     */
    private Integer id;

    /**
     * 开医嘱医生id(医生表)
     */
    private Integer adviceDoctorId;

    /**
     * 医嘱信息ID
     */
    private String advice;

    /**
     * 病人姓名
     */
    private String name;

    /**
     *  病人编号
     */
    private String patientCoding;

    /**
     * 是否使用模板(1: 是 2: 否)
     */
    private Byte template;

    /**
     * 医嘱内容
     */
    private String adviceContent;

    /**
     * 医嘱状态(0：未执行  1：新开  2：已执行  3：作废)
     */
    private Byte adviceState;

    /**
     * 开医嘱时间
     */
    private Date adviceTime;

    private static final long serialVersionUID = 1L;

}