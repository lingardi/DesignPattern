package com.example.lingard.ipctest.BuilderP;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/6.
 */

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    BenzBuilder benzBuilder = new BenzBuilder();

    public BenzModel getAbenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("boom");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BenzModel getBbenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }
}
