package com.itnoob.gmall.user.service.impl;

import com.itnoob.gmall.bean.UmsMember;
import com.itnoob.gmall.bean.UmsMemberReceiveAddress;
import com.itnoob.gmall.service.UserService;
import com.itnoob.gmall.user.mapper.UmsMemberAddressMapper;
import com.itnoob.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberAddressMapper umsMemberAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.findAllUser();
        return umsMembers;
    }

    /**
     * 查询当前用户的所有收获地址
     * @param memberId
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getRecieveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }


}
