package com.itnoob.gmall.user.controller;

import com.itnoob.gmall.bean.UmsMember;
import com.itnoob.gmall.bean.UmsMemberReceiveAddress;
import com.itnoob.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String test(){
        return "hello";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userService.getAllUser();
        return umsMemberList;
    }

    /**
     * @RequestBody: 接收json数据
     * http://localhost:8080/getRecieveAddressByMemberId?memberId=1
     */
    @RequestMapping("getRecieveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getRecieveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =  userService.getRecieveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

}
