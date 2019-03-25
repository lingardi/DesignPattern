package com.example.lingard.ipctest.ProxyP.NormalProxy;

/**
 * Created by lingard on 2019/3/6.
 */

public class GamePlayer implements IGamePlayer {
    private String name;
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception{
        if (_gamePlayer == null){
            throw new Exception("can not a build new player");
        }else {
            this.name = _name;
        }
    }
    @Override
    public void killboss() {

    }

    @Override
    public void login(String name, String psw) {

    }

    @Override
    public void upgrade() {

    }
}
