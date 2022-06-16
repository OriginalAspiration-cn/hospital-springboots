package com.gc.po;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class SysEmr implements Serializable {
    /**
     * 电子病历id
     */
    private Integer id;

    /**
     * 病人信息id
     */
    private Integer patientId;

    /**
     * 医嘱信息id
     */
    private Integer adviceId;

    /**
     * 体征信息id
     */
    private Integer signId;

    /**
     * 检验信息id
     */
    private Integer checkoutId;

    /**
     * 检查信息id
     */
    private Integer examineId;

    private static final long serialVersionUID = 1L;

}