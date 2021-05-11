package com.myweb.controller;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AxiosUserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/axios/findAll")
    public List<User> findAll(){

        return userService.selectAll();
    }
    /**
     * 实现用户更新的操作
     * url地址: http://localhost:8090/axiosUser/updateUser
     * 参数: user对象的JSON串
     * 返回值: 不要求void
     */
    @PutMapping("/axiosUser/updateUser")
    public void updateUser(@RequestBody User user){

        userService.addNew(user);
    }
}
