package com.example.lingard.ipctest.CompositeP;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/13.
 */

public class Branch extends Crop {
    private ArrayList<Crop> crops = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }


    public void addSubordinate(Crop crop){
        setParent(this);
        this.crops.add(crop);
    }

    public ArrayList<Crop> getSubordinate(){
        return this.crops;
    }

}
