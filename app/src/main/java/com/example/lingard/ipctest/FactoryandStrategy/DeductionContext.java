package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

public class DeductionContext {
    private IDeduction iDeduction;

    public IDeduction getiDeduction() {
        return iDeduction;
    }

    public boolean exec(Card card, Trade trade){
        return iDeduction.exec(card, trade);
    }
}
