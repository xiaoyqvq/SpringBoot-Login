package com.yan.helloword.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController{
    @RequestMapping("/login/check")
    public String helloWord(HttpServletRequest request){
            String username=request.getParameter("username");
            String pwd=request.getParameter("pwd");
            return "成功";
    }

}