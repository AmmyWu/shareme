package com.ammy.shareme.server.controller.base;

import com.ammy.shareme.server.dao.JsonObjectEx;
import com.ammy.shareme.server.dao.model.UserInfo;
import com.ammy.shareme.server.service.base.UserInfoManageService;
import com.google.gson.Gson;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
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
    public JsonObjectEx login(HttpServletRequest request) throws IOException {
        Gson gson = new Gson();
        Map map = gson.fromJson(request.getReader(),Map.class);
        String account = (String) map.get("account");
        String password = (String) map.get("password");
        return userInfoManageService.login(account, password);
    }

    @RequestMapping("/register")
    public JsonObjectEx register(HttpServletRequest request) throws IOException {
        Gson gson = new Gson();
        Map map = gson.fromJson(request.getReader(),Map.class);
        String account = (String) map.get("account");
        String password = (String) map.get("password");
        String verifyPassword = (String) map.get("verifyPassword");
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
