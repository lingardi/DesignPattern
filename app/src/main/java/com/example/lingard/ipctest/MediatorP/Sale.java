package com.example.lingard.ipctest.MediatorP;

import java.util.Random;

/**
 * Created by lingard on 2019/3/8.
 */

public class Sale extends AbstractCollegue {

    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number){
        super.abstractMediator.exe("sale.sell", number);
        System.out.println("销售IBM电脑"+number+"台");
    }
    //反馈销售情况，0～100变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
        super.abstractMediator.exe("sale.offsell");
    }
}
