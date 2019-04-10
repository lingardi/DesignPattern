package com.example.lingard.ipctest.ObserverandMediator;

import java.util.Vector;

/**
 * Created by lingard on 2019/4/4.
 */

public abstract class EventCustomer {
    private Vector<EventCustomerType> customType = new Vector<EventCustomerType>();

    public EventCustomer(EventCustomerType type){
        addCustomType(type);
    }

    public void addCustomType(EventCustomerType type) {
        customType.add(type);
    }

    public Vector<EventCustomerType> getCustomType() {
        return customType;
    }

    public abstract void exec(ProductEvent event);
}
