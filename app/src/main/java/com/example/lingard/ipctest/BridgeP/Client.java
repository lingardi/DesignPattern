package com.example.lingard.ipctest.BridgeP;

import com.example.lingard.ipctest.FlyweightP.SignInfo;
import com.example.lingard.ipctest.FlyweightP.SignInfoFactory;

/**
 * Created by lingard on 2019/3/21.
 * 使用该模式时主要考虑如何拆分抽象和实现,进行系统设计时，发现类的继承有N层时，可以考虑使用桥梁模式
 */

public class Client {
    public static void main(String[] args){
        Product house = new House();
        HouseCorp houseCorp = new HouseCorp((House) house);
        houseCorp.makemoney();
    }
}
