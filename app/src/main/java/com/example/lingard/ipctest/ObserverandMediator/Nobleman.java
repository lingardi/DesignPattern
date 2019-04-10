package com.example.lingard.ipctest.ObserverandMediator;

/**
 * Created by lingard on 2019/4/4.
 */

public class Nobleman extends EventCustomer {
    public Nobleman() {
        super(EventCustomerType.EDIT);
        super.addCustomType(EventCustomerType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        //事件类型
        ProductEventType type = event.getType();
        if(type.getValue() == EventCustomerType.CLONE.getValue()){
            System.out.println("贵族处理事件:"+p.getName() +"克隆,事件类型="+type);
        }else{
            System.out.println("贵族处理事件:"+p.getName() +"修改,事件类型="+type);
        }
    }
}
