package com.example.lingard.ipctest.TemplateMethodP;

/**
 * Created by lingard on 2019/3/4.
 */

public class Client {
    public static void main(String[] args){
        BMWModel bmw = new BMWModel();
        CarModel benz = new BenzModel();
        bmw.setAlarm(false);
        bmw.run();
    }
}
