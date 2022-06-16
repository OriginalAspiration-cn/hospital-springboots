package com.gc.po;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 
 * 
 */
public class SysPosition implements Serializable {
    /**
     * 职位id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 职务名称
     */
    private String positionName;

    private static final long serialVersionUID = 1L;

}