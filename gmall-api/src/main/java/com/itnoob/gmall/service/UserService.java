package com.itnoob.gmall.service;

import com.itnoob.gmall.bean.UmsMember;
import com.itnoob.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getRecieveAddressByMemberId(String memberId);
}
