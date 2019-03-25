package com.example.lingard.ipctest.ObserverP;

import java.util.Observable;

/**
 * Created by lingard on 2019/3/15.
 * 引入java.util.Observale实现类
 */

public class Hanfeizi extends Observable implements IHanfeizi {
    @Override
    public void havebreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void havefun() {
        System.out.println("韩非子：开始娱乐了...");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}
