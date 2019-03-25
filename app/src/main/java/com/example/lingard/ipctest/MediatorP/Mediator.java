package com.example.lingard.ipctest.MediatorP;

/**
 * Created by lingard on 2019/3/8.
 */

public class Mediator extends AbstractMediator {

    @Override
    void exe(String s, Object ...objects) {
        if(s.equals("purchase.buy")){ //采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if(s.equals("sale.sell")){ //销售电脑
            this.sellComputer((Integer)objects[0]);
        }else if(s.equals("sale.offsell")){ //折价销售
            this.offSell();
        }else if(s.equals("stock.clear")){ //清仓处理
            this.clearStock();
        }
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }

    private void sellComputer(int number) {
        if(super.stock.getStockNumber()<number){  //库存数量不够销售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80){
            System.out.println("采购IBM电脑:"+number + "台");
            stock.increase(number);
        }else {
            int buyNumber = number/2;
            System.out.println("采购IBM电脑："+buyNumber+ "台");
        }
    }
}
