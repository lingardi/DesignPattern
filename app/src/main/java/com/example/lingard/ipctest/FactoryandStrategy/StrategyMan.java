package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

enum StrategyMan {
    SteadyDeduction("com.cbf4life.common.SteadyDeduction"),
    FreeDeduction("com.cbf4life.common.FreeDeduction");
    String value;
    StrategyMan(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}
