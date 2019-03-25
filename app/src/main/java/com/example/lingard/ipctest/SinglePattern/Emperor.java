package com.example.lingard.ipctest.SinglePattern;

/**
 * Created by lingard on 2019/3/1.
 */

public class Emperor {
    private volatile static Emperor emperor;
    private Emperor(){}

    public static Emperor getEmperor(){
        if (emperor == null){
            synchronized (Emperor.class){
                if (emperor == null){
                    emperor = new Emperor();
                }
            }
        }
        return emperor;
    }

    public void say() {

    }
}
