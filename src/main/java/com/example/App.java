package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.security.auth.login.Configuration;


@SpringBootApplication
public class App extends SpringBootServletInitializer  {

    public static void main(String[] args) throws Exception {
        System.out.println("start boot listener");
        SpringApplication.run(App.class, args);
    }


}