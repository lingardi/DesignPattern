package com.example.lingard.ipctest.ObserverP;

import java.util.*;

/**
 * Created by lingard on 2019/3/15.
 * 引入java.util.Observable对象
 */

public class Liusi implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕...\n");
    }
    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
