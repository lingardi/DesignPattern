package com.example.lingard.ipctest.FactoryandStrategy;

import com.example.lingard.ipctest.FacedeP.Facede;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lingard on 2019/4/1.
 * 策略模式+ 工厂方法模式+ 门面模式
 */

public class Client {
    public static void main(String[] args){
        Card card = initIC();
        showCard(card);
        StrategyFaded faded = new StrategyFaded();
        Trade trade = createTrade();
        faded.deduct(card,trade);
        showCard(card);
    }

    //初始化一个IC卡
    private static Card initIC(){
        Card card = new Card();
        card.setNumber("1100010001000");
        card.setFreemoney(100000);  //1000元
        card.setSteadymoney(80000); //800元
        return card;
    }
    //产生一条交易
    private static Trade createTrade(){
        Trade trade = new Trade();
        System.out.print("请输入交易编号：");
        trade.setTradeId(getInput());
        System.out.print("请输入交易金额：");
        trade.setAmount(Integer.parseInt(getInput()));
        //返回交易
        return trade;
    }
    //打印出当前卡内交易余额
    public static void showCard(Card card){
        System.out.println("IC卡编号:" + card.getNumber());
        System.out.println("固定类型余额："+ card.getSteadymoney()/100.0 + " 元");
        System.out.println("自由类型余额："+ card.getFreemoney()/100.0 + " 元");
    }
    //获得键盘输入
    public static String getInput(){
        String str ="";
        try {
            str=(new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            //异常处理
        }
        return str;
    }
}
