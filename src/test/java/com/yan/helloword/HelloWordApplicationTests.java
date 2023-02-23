package com.yan.helloword;

import com.yan.helloword.Pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class HelloWordApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        Long num = jdbcTemplate.queryForObject("select count(*) from user where id=1", Long.class);
        System.out.println(num);
    }

}
