package com.myweb.controller;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/userList")
    public String userList(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("userList", users);
        return "userList";
    }

    @RequestMapping("/userList/{name}/{age}/{sex}")
    public String addUser(@PathVariable String name, @PathVariable int age, @PathVariable String sex){
        User user = new User();
        user.setName(name).setAge(age).setSex(sex);
        userService.addNew(user);
        return "redirect:/userList";
    }

    @RequestMapping("/userList/{id}/{name}")
    public String updateUser(@PathVariable int id, @PathVariable String name){
        userService.updateName(id, name);
        return "redirect:/userList";
    }
}
