package com.example.lingard.ipctest.ProxyP.DynamicProxy;

import com.example.lingard.ipctest.ProxyP.ForcedProxy.GamePlayer;
import com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer;

/**
 * Created by lingard on 2019/3/7.
 * 被代理类必须实现一个接口，，根据被代理的接口生成所有方法，
 * 所有被代理的方法通过InvocationHandler接管实际的处理任务
 * 既没有创建类，也没有实现Subject接口，这就是动态代理
 */

public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject("Li");
        Subject proxy = SubDynamicProxy.newProxyInstance(subject);
        proxy.login("Li","");
    }
}
