package com.ammy.shareme.server.service.base;

import com.ammy.shareme.server.dao.JsonObjectEx;
import com.ammy.shareme.server.dao.model.UserInfo;

import java.util.List;

public interface UserInfoManageService {
    public JsonObjectEx register(String account, String password, String verifyPassword);
    public JsonObjectEx login(String account,String password);
    public JsonObjectEx readUserInfo(Integer userid);
    public JsonObjectEx editUserInfo(UserInfo userInfo);
    public JsonObjectEx SearchUser(String name);
}
