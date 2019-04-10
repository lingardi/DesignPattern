package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

public class StrategyFactory {
    public static IDeduction getDeduction(StrategyMan strategyMan){
        IDeduction iDeduction = null;
        try {
            iDeduction = (IDeduction) Class.forName(strategyMan.getValue()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iDeduction;
    }
}
