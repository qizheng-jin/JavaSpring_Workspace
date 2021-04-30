package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller  //将该类交给容器管理 同时开启SpringMVC机制
public class HelloController {

    /**
     * 需求: http://localhost:8090/hello 访问hello.html
     * 实现步骤:
     *      1. 拦截用户的请求
     *      2. String 类型的返回值 表示返回页面的名称
     *
     */
    @RequestMapping("/hello")//requestMapping拦截用户请求:如果用户请求域名中有hello则进入下面的函数
    public String hello(){

        return "hello";//配置文件中有suffix配置,可以省略后缀
    }

    @RequestMapping("/say")
    public String say(){
        return "say";
    }
}
