package com.example.lingard.ipctest.ProxyP.ForcedProxy;

/**
 * Created by lingard on 2019/3/6.
 */

public interface IGamePlayer {
    void killboss();
    void login(String name, String psw);
    void upgrade();
    IGamePlayer getproxy();
}
