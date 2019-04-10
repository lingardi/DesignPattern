package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

public class SteadyDeduction implements IDeduction {
    @Override
    public boolean exec(Card card, Trade trade) {
        int halfmoney = (int)Math.rint(trade.getAmount() / 2.0);
        card.setFreemoney(card.getFreemoney() - halfmoney);
        card.setSteadymoney(card.getSteadymoney() - halfmoney);
        return true;
    }
}
