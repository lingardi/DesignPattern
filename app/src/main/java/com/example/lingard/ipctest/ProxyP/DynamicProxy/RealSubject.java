package com.example.lingard.ipctest.ProxyP.DynamicProxy;

/**
 * Created by lingard on 2019/3/7.
 */

public class RealSubject implements Subject {
    private String name;
    public RealSubject(String name){
        this.name = name;
    }
    @Override
    public void killboss() {
        System.out.println();
    }

    @Override
    public void login(String name, String psw) {

    }

    @Override
    public void upgrade() {

    }
}
