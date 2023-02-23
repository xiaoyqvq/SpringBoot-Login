package com.yan.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWordApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(HelloWordApplication.class, args);



    }

}
