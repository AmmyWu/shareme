package com.ammy.shareme.server.controller.base;

import com.ammy.shareme.server.service.base.UserInfoManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userInfoManage")
public class UserInfoManage {

    @Autowired
    UserInfoManageService UserInfoManageService;
    @RequestMapping("/test")
    public String test(){
        return "test success";
    }

}
