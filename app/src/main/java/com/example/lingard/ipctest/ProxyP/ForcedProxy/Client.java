package com.example.lingard.ipctest.ProxyP.ForcedProxy;



/**
 * Created by lingard on 2019/3/6.
 * 调用者直接调用真实角色，通过真实角色找到代理，只有通过真是对象指定的代理类才能访问，
 * 真实角色管理代理角色,getproxy()
 *
 */

public class Client {
    public static void main(String[] args){
        IGamePlayer iGamePlayer = new GamePlayer("Li");
        IGamePlayer proxy = iGamePlayer.getproxy();
//        IGamePlayer proxy = new GamePlayerProxy(iGamePlayer);不能访问方法，需通过指定代理getproxy()
        proxy.killboss();
        proxy.login("","");
        proxy.upgrade();
    }

}
