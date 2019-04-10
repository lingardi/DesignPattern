package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

public class Card {
    private String number;
    private int steadymoney;
    private int freemoney;

    public void setFreemoney(int freemoney) {
        this.freemoney = freemoney;
    }

    public int getFreemoney() {
        return freemoney;
    }

    public int getSteadymoney() {
        return steadymoney;
    }

    public void setSteadymoney(int steadymoney) {
        this.steadymoney = steadymoney;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
