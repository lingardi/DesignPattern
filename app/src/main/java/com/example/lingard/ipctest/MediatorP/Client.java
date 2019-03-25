package com.example.lingard.ipctest.MediatorP;

/**
 * Created by lingard on 2019/3/8.
 * 同事类构造函数需注入中介者，中介者可以使用getter/setter，
 * Purchase,Sale,Stock都是不同同事类
 * 中介者中exe()方法用于处理不同对象之间的复杂逻辑关系
 */

public class Client {
    public static void main(String[] args){
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        Sale sale =new Sale(mediator);
        sale.sellIBMComputer(1);
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
