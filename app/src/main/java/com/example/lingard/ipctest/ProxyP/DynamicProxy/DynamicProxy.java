package com.example.lingard.ipctest.ProxyP.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lingard on 2019/3/7.
 */

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<T>[] interfaces, InvocationHandler invocationHandler){
        if (true){
            new BeforeAdvice().exe();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, invocationHandler);
    }
}
