package com.yan.helloword.Controller;

import com.yan.helloword.Pojo.User;
import com.yan.helloword.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HelloController{
    @Autowired
    UserLoginService userLoginService;
    @RequestMapping("/query")
    public String helloWord(){
        List<User> users = userLoginService.queryAllUser();
        users.forEach(user->{
            System.out.println(user);
        });
        return "success";
    }

    @PostMapping("/userlogin")
    public String userLogin(@ModelAttribute User user){
        String username=user.getUsername();
        String password=user.getPassword();
        User bean=userLoginService.findUserById(username);
        if(password.equals(bean.getPassword())){
            return "/login/success";
        }
        return null;


    }

    @GetMapping("/login")
    public String intoLogin(){

        return "/login/login";

    }

}