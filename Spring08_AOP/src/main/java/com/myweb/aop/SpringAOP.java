package com.myweb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//切面
@Aspect
public class SpringAOP {
//    切入点表达式:pointcut
    @Pointcut("execution(* com.myweb..*(..)) ")
    public void pointcut(){

    }

    /**
     *
     * within 匹配包路径.类名, 包路径中的..代表多级包, *代表包里面的所有子包或类
     * bean 匹配bean标签名
     * execution 匹配(返回值类型 包路径.类名.方法名(参数列表)), eclipse没有自动拆装箱的功能,需要注意参数类型
     * annotation
     * Spring为了AOP动态获取目标对象以及方法中的数据,则通过joinpoint对象
     *
     */
//    @Before("bean(deptServiceImpl)")
//    @Before("within(com.myweb.service.DeptServiceImpl)")
//    @Before("execution(* com.myweb.service.DeptServiceImpl.add*())")
//    @After("execution(* com.myweb..*.*(..))")
    @Before("@annotation(com.myweb.anno.Cache)")
    public void before(JoinPoint joinPoint){
        System.out.println("这是before通知");
        System.out.println("获取目标对象的类型: " + joinPoint.getTarget().getClass());
        System.out.println("获取目标方法签名: " + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("获取目标对象: " + joinPoint.getSignature().getName());
        System.out.println("获取方法参数: " + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 记录方法的返回值
     * pointcut:关联切入点表达式
     * returning: 将方法返回值通过形参result进行传递
     * @AfterReturning (pointcut = "pointcut()", returning = "result")
     * 注意事项:
     *      Spring在进行参数赋值时候,采用index[0]下标的方式赋值
     */
    @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void after(JoinPoint joinPoint, Object result){
        System.out.println("after注解");
        System.out.println("返回值: " + result);
    }

//    @AfterThrowing("pointcut()")
//    public void throwing(){
//        System.out.println("throw注解");
//    }

    /**
     *
     *  环绕方法: 里面的参数必须要用ProceedingJoinPoint
     *          这个参数可以控制目标方法的执行
     *          ProceedingJoinPoint是JoinPoint的子类
     *          但是只能在Around中使用
     */
    @Around("execution(* com.myweb.service.DeptServiceImpl.doAround())")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("进行一个环的绕");
        Object result = null;
        try {
            Long start = System.currentTimeMillis();
            result = joinPoint.proceed();
            Long end = System.currentTimeMillis();
            System.out.println("程序耗时: " + (end-start));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("进行一个环的绕");
        return result;
    }
}
