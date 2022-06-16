package com.gc.po;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 
 * 
 */
public class SysExamineType implements Serializable {
    /**
     * 检查类型id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 检查类型名称
     */
    private String typeName;

    private static final long serialVersionUID = 1L;

}