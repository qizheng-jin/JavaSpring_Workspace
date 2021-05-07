package com.myweb.controller;

import com.myweb.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 根据getJSON请求,获取User对象的JSON数据
 * 用法: 如果需要返回JSON数据则要使用注解@ResponseBody
 * 知识点讲解:
 */
@RestController //注解@RestController是@ResponseBody和@Controller的合集,用于Service层
public class JSONController {
    @RequestMapping("/getJSON")
    @ResponseBody //返回值时一个JSON串
    public User getJSON(){
        User user = new User();
        user.setId(1000).setName("小明").setAge(19);
        return user;
    }
}
