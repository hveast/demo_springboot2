package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${country}")
    private String country;

    @Value("${city}")
    private String city;

    @Value("${info}")
    private String info;

    @RequestMapping("/")
    String home(){
        return "start boot complete";
    }

    @RequestMapping("/login")
    String login(){
        return "login page:" + country + ":" + city + ":" + info;
    }
}
