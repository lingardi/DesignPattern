package com.example.lingard.ipctest.ObserverandMediator;

/**
 * Created by lingard on 2019/4/4.
 */

public enum EventCustomerType {
    NEW(1),
    DEL(2),
    EDIT(3),
    CLONE(4);

    int value;

    EventCustomerType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
