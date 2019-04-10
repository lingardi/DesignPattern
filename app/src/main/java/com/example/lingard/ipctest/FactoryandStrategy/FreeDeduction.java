package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

public class FreeDeduction implements IDeduction {
    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreemoney(card.getFreemoney() - trade.getAmount());
        return true;
    }
}
