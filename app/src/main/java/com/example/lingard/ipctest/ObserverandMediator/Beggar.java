package com.example.lingard.ipctest.ObserverandMediator;

/**
 * Created by lingard on 2019/4/4.
 */

public class Beggar extends EventCustomer {

    public Beggar() {
        super(EventCustomerType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        Product source = event.getSource();
        ProductEventType productEvent = event.getType();
        System.out.println("乞丐处理事件:"+source.getName() +"销毁,事件类型="+productEvent);
    }
}
