package com.lemon.algorithm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @Author lemon
 * @Date 2021/3/3
 */
public class ProxyTest {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method:" +method);
                System.out.println("args:" + args[0]);
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class}, invocationHandler);
        hello.day("test");

    }
}

interface Hello {
    void day(String arg);
}