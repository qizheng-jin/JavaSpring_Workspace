package com.myweb.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//控制注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
//注解的作用对象
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface Cache {
}
