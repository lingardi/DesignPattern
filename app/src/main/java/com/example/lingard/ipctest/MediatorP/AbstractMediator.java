package com.example.lingard.ipctest.MediatorP;

/**
 * Created by lingard on 2019/3/8.
 */

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    abstract void exe(String s, Object ...objects);
}
