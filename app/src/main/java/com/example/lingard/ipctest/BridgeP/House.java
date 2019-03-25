package com.example.lingard.ipctest.BridgeP;

/**
 * Created by lingard on 2019/3/21.
 */

public class House extends Product{
    @Override
    public void bemaked() {
        System.out.println("生产出的房子是这样的...");
    }

    @Override
    public void beselled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
