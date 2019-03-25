package com.example.lingard.ipctest.MediatorP;

/**
 * Created by lingard on 2019/3/8.
 */

public class Purchase extends AbstractCollegue{

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.abstractMediator.exe("purchase.buy", number);
    }
    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
