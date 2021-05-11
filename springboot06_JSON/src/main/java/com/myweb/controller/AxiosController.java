package com.myweb.controller;

import com.myweb.pojo.AxiosPOJO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin //允许当前类中的所有方法执行跨域操作
public class AxiosController {
    /**
     * Axios入门案例
     */

    @RequestMapping("/hello")
    public String hello(){
        return "Vue的异步请求";
    }

    @GetMapping("/axios")
    public String getAxios(Integer id){
        return "动态获取数据: " + id;
    }

    @GetMapping("/axios/{id}")
    public String getRestFul(@PathVariable Integer id){
        return "动态获取数据: " + id;
    }

    @GetMapping("/axiosParams")
    public String getAxiosParams(Integer id){
        return "动态获取数据: " + id;
    }

    @RequestMapping("/test/{id}")
    public String getRestFulAxios(@PathVariable Integer id){
        return "动态获取数据: " + id;
    }

    /**
     *
     * @param axiosPOJO
     * @return
     *
     * 接收post请求, 如果前端接收的是一个JSON字符串,则使用注解@RequestBody将json串转化为对象
     */
    @PostMapping("/addAxios")
    public AxiosPOJO addAxios(@RequestBody AxiosPOJO axiosPOJO){

        return axiosPOJO;
    }

    //利用form表单接收数据
    @PostMapping("/addAxiosForm")
    public AxiosPOJO addAxiosForm(AxiosPOJO axiosPOJO){
        return axiosPOJO;
    }

    @PostMapping("/axios2/{id}/{name}")
    public AxiosPOJO restFulAxios(AxiosPOJO axiosPOJO){
        return axiosPOJO;
    }
}
