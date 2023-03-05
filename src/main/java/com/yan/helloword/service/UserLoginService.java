package com.yan.helloword.service;

import com.yan.helloword.Pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserLoginService {
    public List<User> queryAllUser();

    public User findUserById(String username);
}
