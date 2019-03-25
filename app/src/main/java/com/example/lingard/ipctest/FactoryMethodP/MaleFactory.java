package com.example.lingard.ipctest.FactoryMethodP;

/**
 * Created by lingard on 2019/3/4.
 */

public class MaleFactory extends AbstractFactory {
    @Override
    public <T extends IHuman> T createBlack() {
        return (T) new MaleBlack();
    }

    @Override
    public <T extends IHuman> T createYellow() {
        return null;
    }

    @Override
    public <T extends IHuman> T createWhite() {
        return null;
    }
}
