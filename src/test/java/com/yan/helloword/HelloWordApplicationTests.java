package com.yan.helloword;

import com.yan.helloword.Pojo.User;
import com.yan.helloword.mapper.UserLoginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class HelloWordApplicationTests {
    @Autowired
    UserLoginMapper userLoginMapper;

    @Test
    void contextLoads() {

    }

}
