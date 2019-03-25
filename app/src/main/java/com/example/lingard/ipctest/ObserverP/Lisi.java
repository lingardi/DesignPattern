package com.example.lingard.ipctest.ObserverP;

import java.util.Observable;

/**
 * Created by lingard on 2019/3/15.
 */

public class Lisi implements Observer {
    @Override
    public void update(Observable o ,String content) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(content.toString());
        System.out.println("李斯：汇报完毕...\n");
    }

    private void reportToQinShiHuang(String s) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+s);
    }
}
