package com.example.lingard.ipctest.BridgeP;

/**
 * Created by lingard on 2019/3/21.
 */

public class HouseCorp extends Corp {

    public HouseCorp(House product) {
        super(product);
    }

    @Override
    public void makemoney() {
        super.makemoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
