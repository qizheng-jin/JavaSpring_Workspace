package com.myweb.controller;

import com.myweb.pojo.UserAccount;
import com.myweb.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;

    @RequestMapping("/success")
    public String toSuccess(){
        return "html_files/success";
    }

    @RequestMapping("/login")
    public String toLogin(){
        return "html_files/login";
    }

//    @RequestMapping("/error")
//    public String toError(){
//        return "error";
//    }

    @RequestMapping("/logged")
    public String loginMethod(String username, String password, boolean agreement, Model model){
        if(agreement){
            model.addAttribute("agreement", !agreement);
            List<UserAccount> accounts = userAccountService.login(username);
            if(accounts.size()==0){
                System.out.println("该用户不存在");
                model.addAttribute("isExist", true);
                return "html_files/error";
            }
            if(accounts.size()==1){
                if(password.equals(accounts.get(0).getPassword())){
                    System.out.println("登陆成功");
                    return "html_files/success";
                }else{
                    System.out.println("密码不匹配");
                    model.addAttribute("isShow", true);
                    return "html_files/error";
                }
            }
        }

        return "html_files/success";
    }


    @GetMapping("/axios")
    public String getAxios(Integer id){
        return "动态获取数据: " + id;
    }
}
