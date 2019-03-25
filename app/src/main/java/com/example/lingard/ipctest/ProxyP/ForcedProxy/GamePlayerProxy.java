package com.example.lingard.ipctest.ProxyP.ForcedProxy;

import com.example.lingard.ipctest.ProxyP.NormalProxy.GamePlayer;
import com.example.lingard.ipctest.ProxyP.NormalProxy.IGamePlayer;

/**
 * Created by lingard on 2019/3/6.
 *
 */

public class GamePlayerProxy implements com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer {
    private com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer iGamePlayer;
    public GamePlayerProxy(com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }
    @Override
    public void killboss() {
        this.iGamePlayer.killboss();
    }

    @Override
    public void login(String name, String psw) {
        this.iGamePlayer.login(name,psw);
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }

    @Override
    public com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer getproxy() {
        return null;
    }
}
