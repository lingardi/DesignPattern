package com.example.lingard.ipctest.ProxyP.DynamicProxy;

/**
 * Created by lingard on 2019/3/7.
 */

class BeforeAdvice implements Advice {
    @Override
    public void exe() {
        System.out.println("前置通知");
    }
}
