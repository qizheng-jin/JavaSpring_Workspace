package com.myweb.proxy;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class StaticProxy implements UserService {

//    要求引入目标的对象
    @Autowired()
    @Qualifier("target")
    private UserService target;

    //    代理的目的:对原有的方法进行拓展
    @Override
    public void addUser(User user) {
        try{
            System.out.println("事务开始");
            target.addUser(user);
            System.out.println("事务结束");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }

    @Override
    public void deleteUser(User user) {
        try{
            System.out.println("事务开始");
            target.deleteUser(user);
            System.out.println("事务结束");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }
}
