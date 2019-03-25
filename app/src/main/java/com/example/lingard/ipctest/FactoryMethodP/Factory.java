package com.example.lingard.ipctest.FactoryMethodP;

/**
 * Created by lingard on 2019/3/1.
 */

public class Factory extends AbstractFactory {
    public <T extends IHuman> T createHuman(Class<T> tClass) {
        IHuman human = null;
        try {
            human = (T) Class.forName(tClass.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return (T) human;
    }

    @Override
    public <T extends IHuman> T createBlack() {
        return null;
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
