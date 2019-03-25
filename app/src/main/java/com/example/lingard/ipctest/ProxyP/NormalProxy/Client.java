package com.example.lingard.ipctest.ProxyP.NormalProxy;

import com.example.lingard.ipctest.TemplateMethodP.BMWModel;
import com.example.lingard.ipctest.TemplateMethodP.BenzModel;
import com.example.lingard.ipctest.TemplateMethodP.CarModel;

/**
 * Created by lingard on 2019/3/6.
 * 调用者知道Proxy的存在，才能访问，不用知道代理了谁
 */

public class Client {
    public static void main(String[] args){
        IGamePlayer iGamePlayer = new GamePlayerProxy("Li");
        iGamePlayer.killboss();
        iGamePlayer.login("","");
        iGamePlayer.upgrade();
    }

}
