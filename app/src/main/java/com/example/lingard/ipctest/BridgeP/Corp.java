package com.example.lingard.ipctest.BridgeP;

/**
 * Created by lingard on 2019/3/21.
 */

public abstract class Corp {
    private Product product;

    public Corp(Product product){
        this.product = product;
    }

    public void makemoney(){
        this.product.bemaked();
        this.product.beselled();
    }
}
