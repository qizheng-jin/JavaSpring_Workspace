package com.myweb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//切面
@Aspect
public class SpringAop {

    @Pointcut("execution(* com.myweb.service.EmpService.addEmp(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("类名:"+joinPoint.getTarget().getClass());
        System.out.println("参数列表: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("方法签名: " + joinPoint.getSignature());
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("方法名: " + joinPoint.getSignature().getName());
    }

    @Around("@annotation(com.myweb.anno.MyAnno)")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("进行一个环的绕");
        Object result = null;
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("进行一个绕的环");
        return result;
    }
}
