package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String getUser(){
//        System.out.println("得到的参数: " + id + "|" + name + "|" + age);
        return "user";
    }

    @RequestMapping("/addUser")
    public String addUser(int id, String name, int age){
        System.out.println("得到的参数: " + id + "|" + name + "|" + age);
        return "success";
    }
}
