package com.myweb.controller;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        List<User> users = userService.selectAll();
        return users.toString();
    }

    /**
     * 查询所有的用户列表数据,在userList.html中展现
     */
    @RequestMapping("/userList")
    public String userList(Model model){
        List<User> users = userService.selectAll();
        model.addAttribute("userList", users);
        return "userList";
    }

    /**
     * 需求: 利用restFul实现用户数据新增
     * URL地址: /user/tom/18/男
     */
    @RequestMapping("/user/{name}/{age}/{sex}")
    public String userInsert(@PathVariable String name, @PathVariable int age, @PathVariable String sex){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        userService.addNew(user);
        return "redirect:/userList";
    }

    @RequestMapping("/userAjax")
    public String toUserAjax(){
        return "userAjax";
    }

    @RequestMapping("/findAjaxUser")
    @ResponseBody
    public List<User> findAjaxUser(Integer id, String name){
        List<User> userList = userService.selectAll();
        System.out.println(id + "|" + name);
        return userList;
    }
}
