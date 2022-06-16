package com.gc.po;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class SysCheckoutType implements Serializable {
    /**
     * 检验类型id
     */
    private Integer id;

    /**
     * 父检验类型id(0表示是根检验类型)
     */
    private Integer typeNameId;

    /**
     * 检验类型名称
     */
    private String typeName;

    private static final long serialVersionUID = 1L;

}