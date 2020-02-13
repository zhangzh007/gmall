package com.itnoob.gmall.user.mapper;

import com.itnoob.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> findAllUser();
}
