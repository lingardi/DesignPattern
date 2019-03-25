package com.example.lingard.ipctest.ProxyP.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lingard on 2019/3/7.
 */

public class MyInvocationHandler implements InvocationHandler {
    private Object object;
    public MyInvocationHandler(Object o){
        this.object = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("登老子号");
        }
        return method.invoke(this.object, args);
    }
}
