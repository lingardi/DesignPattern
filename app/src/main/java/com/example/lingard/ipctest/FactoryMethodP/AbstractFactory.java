package com.example.lingard.ipctest.FactoryMethodP;

/**
 * Created by lingard on 2019/3/1.
 */

public abstract class AbstractFactory {
//    public abstract <T extends IHuman> T createHuman(Class<T> tClass);
    public abstract <T extends IHuman> T createBlack();
    public abstract <T extends IHuman> T createYellow();
    public abstract <T extends IHuman> T createWhite();
}
