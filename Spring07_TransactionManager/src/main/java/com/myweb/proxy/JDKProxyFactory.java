package com.myweb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用一个工厂动态的为目标对象创建代理
 * Proxy类有一个方法叫 .newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
 * 三个参数: ClassLoader(类加载器, 获取目标类的类型),
 *          Class<?>[](接口类的数组),
 *          InvocationHandler 对目标方法进行拓展
 */
public class JDKProxyFactory {

    //要求用户传递对象, 匿名内部类使用外部对象必须要用final修饰,所以 target必须用final
    public static Object getProxy(final Object target){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();

        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
//            代理对象执行方法时invoke()才会执行,创建代理对象的时候并不会执行
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
//                添加事务的控制
                    System.out.println("事务开始");
//                    执行目标方法参数列表(target目标对象, args代表方法参数, result是目标方法返回值, method是目标方法,
                    result = method.invoke(target, args);
                    System.out.println("事务提交");
                }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("事务回滚");
                }
                return result;
            }
        });
        return proxy;
    }
}
