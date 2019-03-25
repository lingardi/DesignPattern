package com.example.lingard.ipctest.ISP;

/**
 * Created by lingard on 2019/3/1.
 */

public class PrettyGirl implements IPrettyGirl {
    private String name;

    public PrettyGirl(String name){
        this.name=name;
    }
    @Override
    public void goodlooking() {
        System.out.println(this.name + "hao");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "hao");

    }

    @Override
    public void greatCharacter() {
        System.out.println(this.name + "hao");

    }
}
