package com.example.lingard.ipctest.BuilderP;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/6.
 */

public class BenzBuilder extends CarBuilder {
    private CarModel benzModel = new BenzModel();
    @Override
    public CarModel getCarModel() {
        return benzModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }
}
