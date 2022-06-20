package com.gc.vo;

import com.gc.po.SysUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo extends SysUser implements Serializable {

    private String departmentName;//所属科室名称
    private String positionName;//职务名称
    private String rankName;//级别名称
}
