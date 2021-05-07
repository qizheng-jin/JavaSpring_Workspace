package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    /**
     * 常规get请求:
     *      url地址: http://localhost:8090/restFul?id=1&name=tom
     * get请求的弊端: 如果参数请求有多个, 则key-value的结构需要多份
     * RestFul结构:
     *      1. 参数之间使用/分割
     *      2. 参数的位置一旦确定,不可更改
     *      3. 参数使用{}的形式进行包裹, 并且设定形参
     *      4. 在接收参数时,使用特定的注解取值 @PathVariable
     *      5. method要和前端form的method相互匹配
     *      6. 增: GET 删: DELETE 改:PUT 查:POST
     *      7. RequestMapping可以细分为GetMapping, DeleteMapping, PutMapping, PostMapping
     *
     */
    @RequestMapping(value = "/restFul/{id}/{name}", method = RequestMethod.GET)
    public String restFul(@PathVariable("id") Integer id, @PathVariable String name){
        System.out.println("获取参数:" + id + "|" + name);
        return "success";
    }

}
