package com.example.lingard.ipctest.ProxyP.DynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by lingard on 2019/3/7.
 */

public class SubDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] tClass = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        return (T) newProxyInstance(classLoader,tClass, invocationHandler);
    }
}
