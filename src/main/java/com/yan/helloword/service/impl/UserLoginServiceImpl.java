package com.yan.helloword.service.impl;

import com.yan.helloword.Pojo.User;
import com.yan.helloword.mapper.UserLoginMapper;
import com.yan.helloword.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    UserLoginMapper userLoginMapper;
    @Override
    public List<User> queryAllUser() {
        return userLoginMapper.queryAllUser();
    }

    @Override
    public User findUserById(String username) {
        return userLoginMapper.findUserById(username);
    }
}
