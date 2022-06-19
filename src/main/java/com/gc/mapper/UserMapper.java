package com.gc.mapper;

import com.gc.po.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

//    查询登录的证号密码是否正确
    SysUser selectName(String userName);

}
