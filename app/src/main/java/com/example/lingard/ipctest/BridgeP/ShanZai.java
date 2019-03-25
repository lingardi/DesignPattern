package com.example.lingard.ipctest.BridgeP;

/**
 * Created by lingard on 2019/3/21.
 */

public class ShanZai extends Product {
    @Override
    public void bemaked() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beselled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
