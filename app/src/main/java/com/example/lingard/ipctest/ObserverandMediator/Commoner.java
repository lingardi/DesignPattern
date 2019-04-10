package com.example.lingard.ipctest.ObserverandMediator;

/**
 * Created by lingard on 2019/4/4.
 */

public class Commoner extends EventCustomer {
    public Commoner() {
        super(EventCustomerType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        Product product = event.getSource();
        ProductEventType type = event.getType();
        System.out.println("平民处理事件:"+product.getName() +"诞生记,事件类型="+type);
    }
}
