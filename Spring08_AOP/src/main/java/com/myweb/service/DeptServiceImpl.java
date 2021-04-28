package com.myweb.service;

import com.myweb.anno.Cache;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService{


    @Override
    public void addDept() {

        System.out.println("添加部门信息");
//        测试afterthrowing代码
//        int[] a= new int[0];
//        System.out.println(a[1]);
    }

    @Override
    @Cache
    public void updateDept() {
        System.out.println("更新部门");
    }

    @Override
    public String after(Integer id) {

        return "spring通知的测试";
    }

    @Override
    public void doAround() {
        System.out.println("环绕的测试方法");
    }
}
