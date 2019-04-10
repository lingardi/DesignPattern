package com.example.lingard.ipctest.ObserverandMediator;

import com.example.lingard.ipctest.ObserverP.Observer;

import java.util.Observable;
import java.util.Vector;

/**
 * Created by lingard on 2019/4/4.
 */

public class EventDispatch implements java.util.Observer{
    private final static EventDispatch dispatch = new EventDispatch();
    //事件消费者
    private Vector<EventCustomer> customer = new Vector<EventCustomer>();
    private EventDispatch(){}

    public static EventDispatch getEventDispatch(){
        return dispatch;
    }

    @Override
    public void update(Observable o, Object arg) {
        Product product = (Product) arg;
        ProductEvent event = (ProductEvent) o;
        for (EventCustomer eventCustomer: customer){
            for (EventCustomerType type : eventCustomer.getCustomType()){
                if (type.getValue() == event.getType().getValue()){
                    eventCustomer.exec(event);
                }
            }
        }
    }

    public void registerCustomer(EventCustomer customer){
        this.customer.add(customer);
    }
}
