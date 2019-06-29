package com.ammy.shareme.server.controller.base;

import com.ammy.shareme.server.dao.JsonObjectEx;
import com.ammy.shareme.server.dao.model.UserInfo;
import com.ammy.shareme.server.service.base.UserInfoManageService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("userInfoManage")
public class UserInfoManage {

    @Autowired
    UserInfoManageService userInfoManageService;

    @RequestMapping("/test")
    public String test() {
        return "test success";
    }

    @RequestMapping("/login")
    public JsonObjectEx login(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        return userInfoManageService.login(account, password);
    }

    @RequestMapping("/register")
    public JsonObjectEx register(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String verifyPassword = request.getParameter("verifyPassword");
        return userInfoManageService.register(account, password, verifyPassword);
    }

    @RequestMapping("/searchUser")
    public JsonObjectEx searchUser(String account) {
        return userInfoManageService.SearchUser(account);
    }

    @RequestMapping("/readUserInfo")
    public JsonObjectEx readUserInfo(Integer userid) {
        return userInfoManageService.readUserInfo(userid);
    }

    @RequestMapping("/edit")
    public JsonObjectEx editUserInfo(HttpServletRequest request){

        Object key = request.getParameter("key");
        return  userInfoManageService.editUserInfo((UserInfo) key);
    }
}
