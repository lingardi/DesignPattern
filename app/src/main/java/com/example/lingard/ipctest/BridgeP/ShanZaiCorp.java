package com.example.lingard.ipctest.BridgeP;

/**
 * Created by lingard on 2019/3/21.
 */

public class ShanZaiCorp extends Corp {
    public ShanZaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makemoney() {
        super.makemoney();
        System.out.println("我赚钱呀...");
    }
}
