package com.example.lingard.ipctest.ObserverandMediator;

/**
 * Created by lingard on 2019/4/4.
 * 事件触发框架,工厂方法模式创建product对象，观察者模式解决事件通知处理者，桥梁模式连接product和event
 * EventDispatch中使用了中介者模式，耦合了不同处理者
 */

public class Client {
    public static void main(String[] args){
        EventDispatch dispatch = EventDispatch.getEventDispatch();
        dispatch.registerCustomer(new Beggar());
        dispatch.registerCustomer(new Commoner());
        dispatch.registerCustomer(new Nobleman());
        ProductManager factory = new ProductManager();
        Product product = factory.createProduct("小男孩原子弹");
        factory.editProduct(product,"ppp");
        factory.clone(product);
        factory.abandonProduct(product);

    }
}
