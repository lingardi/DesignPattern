package com.example.lingard.ipctest.FactoryMethodP;

/**
 * Created by lingard on 2019/3/4.
 */

public class FemaleFactory extends AbstractFactory {
    @Override
    public IHuman createBlack() {
        return new FemaleBlack();
    }

    @Override
    public IHuman createYellow() {
        return null;
    }

    @Override
    public IHuman createWhite() {
        return null;
    }
}
