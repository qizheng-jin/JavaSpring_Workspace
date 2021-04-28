package com.myweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.myweb")
@EnableAspectJAutoProxy(proxyTargetClass=true)
/**
 启动AOP注释 创建代理对象
 默认启用JDK动态代理
 目标对象没有实现接口,则采用Cglib
 强制使用cglib proxyTargetClass=true
 JDK代理创建速度快, 运行时稍慢
 Cglib创建时速度慢, 运行时更快
 */
public class SpringConfig {
}
