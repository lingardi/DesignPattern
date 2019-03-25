package com.example.lingard.ipctest.CompositeP;

/**
 * Created by lingard on 2019/3/13.
 */

public abstract class Crop {
    private String name;
    private int salary;
    private String position = "";
    private Crop parent;

    public Crop(String name, String position, int salary){
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getInfo(){
        return this.name + this.position + this.salary;
    }

    public Crop getParent() {
        return parent;
    }

    public void setParent(Crop parent) {
        this.parent = parent;
    }
}
