package com.example.lingard.ipctest.ProxyP.ForcedProxy;

import com.example.lingard.ipctest.ProxyP.NormalProxy.IGamePlayer;

/**
 * Created by lingard on 2019/3/6.
 */

public class GamePlayer implements com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer {
    private String name;
    private com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer proxy;
    public GamePlayer( String _name) {
        this.name = _name;
    }

    @Override
    public void killboss() {
        if (isProxy()){

        }else {
            System.out.println("滚");
        }
    }

    @Override
    public void login(String name, String psw) {

    }

    @Override
    public void upgrade() {

    }

    @Override
    public com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer getproxy() {
        this.proxy = (com.example.lingard.ipctest.ProxyP.ForcedProxy.IGamePlayer) new GamePlayerProxy(this);
        return this.proxy;    }

    public boolean isProxy(){
        if (this.proxy==null){
            return false;
        }else {
            return true;
        }
    }
}
