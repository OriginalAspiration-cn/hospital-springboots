package com.gc.po;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 
 * 
 */
public class SysPerformer implements Serializable {
    /**
     * 执行者id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 执行者名称
     */
    private String performerName;

    private static final long serialVersionUID = 1L;
}