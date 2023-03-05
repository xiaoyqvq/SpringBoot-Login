package com.yan.helloword.mapper;

import com.yan.helloword.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserLoginMapper {

    public List<User> queryAllUser();

    public User findUserById(String username);


}
