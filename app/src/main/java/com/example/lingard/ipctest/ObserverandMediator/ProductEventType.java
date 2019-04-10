package com.example.lingard.ipctest.ObserverandMediator;

/**
 * Created by lingard on 2019/4/4.
 */

public enum ProductEventType {
    NEW_PRODUCT(1),
    DEL_PRODUCT(2),
    //修改一个产品
    EDIT_PRODUCT(3),
    //克隆一个产品
    CLONE_PRODUCT(4);

    int value;
    ProductEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
