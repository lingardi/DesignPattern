package com.example.lingard.ipctest.FactoryandStrategy;

/**
 * Created by lingard on 2019/4/1.
 */

public class StrategyFaded {
    public Card deduct(Card card, Trade trade){
        StrategyMan strategyMan = getDeductionType(trade);
        IDeduction iDeduction = StrategyFactory.getDeduction(strategyMan);
        iDeduction.exec(card,trade);
        return card;
    }

    //获得对应的商户消费策略
    private static StrategyMan getDeductionType(Trade trade){
        //模拟操作
        if(trade.getTradeId().contains("abc")){
            return StrategyMan.FreeDeduction;
        }else{
            return StrategyMan.SteadyDeduction;
        }
    }
}
