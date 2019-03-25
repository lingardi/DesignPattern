package com.example.lingard.ipctest.ProxyP.NormalProxy;

/**
 * Created by lingard on 2019/3/6.
 *
 */

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer;
    public GamePlayerProxy(String name){
        try {
            iGamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
