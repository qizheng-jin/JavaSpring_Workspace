package com.myweb.factory;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

//钩子函数(回调)
public class SpringFactory implements FactoryBean<Calendar> {

    //工厂模式实例化对象的方法
    @Override
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    //获取类型
    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    //默认条件下spring容器中都是单例对象
    //多线程问题 多例对象
    @Override
    public boolean isSingleton() {
        return true;
    }
}
