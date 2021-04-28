package com.myweb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static Object createProxy(final Object target){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("事务开始");
                    result = method.invoke(target, args);
                    System.out.println("事务结束");
                }catch(Exception e){
                    e.printStackTrace();
                }
                return result;
            }
        });
        return proxy;
    }
}
