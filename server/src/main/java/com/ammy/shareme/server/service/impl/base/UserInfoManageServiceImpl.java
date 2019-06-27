package com.ammy.shareme.server.service.impl.base;

import com.ammy.shareme.server.dao.JsonObjectEx;
import com.ammy.shareme.server.dao.mapper.UserInfoMapper;
import com.ammy.shareme.server.dao.model.UserInfo;
import com.ammy.shareme.server.dao.model.UserInfoExample;
import com.ammy.shareme.server.service.base.UserInfoManageService;
import com.ammy.shareme.server.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoManageServiceImpl implements UserInfoManageService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public JsonObjectEx register(String account, String password, String verifyPassword) {
        if(!password.equals(verifyPassword))
            return new JsonObjectEx("two password are different and can not create the account");
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(account);
        userInfo.setPassword(password);
        insert(userInfo);
        return new JsonObjectEx("register success!",userInfo);
    }

    @Override
    public JsonObjectEx login(String account,String password) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andAccountEqualTo(account);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        if (userInfos.size()==0)
            return new JsonObjectEx("there is no account named "+account);
        if(userInfos.get(0).getPassword().equals(MD5Util.getMD5(password)))
            return new JsonObjectEx("login success!",userInfos.get(0));
        return new JsonObjectEx("password wrong!");
    }

    @Override
    public JsonObjectEx readUserInfo(Integer userid) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserIdEqualTo(userid);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        if(userInfos.size() == 0)
            return new JsonObjectEx("there is no such person");
        return new JsonObjectEx("can read the user info",userInfos.get(0));
    }

    @Override
    public JsonObjectEx editUserInfo(UserInfo userInfo) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserIdEqualTo(userInfo.getUserId());
        update(userInfo,userInfoExample);
        return new JsonObjectEx("edit success!",userInfo);
    }

    @Override
    public JsonObjectEx SearchUser(String name) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUsernameLikeInsensitive(name);
        return new JsonObjectEx("search success",userInfoMapper.selectByExample(userInfoExample));
    }

    public void insert(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    public void update(UserInfo userInfo,UserInfoExample example){
        userInfoMapper.updateByExample(userInfo,example);
    }

    public void delete(Integer userid){
        userInfoMapper.deleteByPrimaryKey(userid);
    }
}
