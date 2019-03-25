package com.example.lingard.ipctest.OCP;

/**
 * Created by lingard on 2019/3/1.
 */

public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int oldprice = super.getPrice();
        int offprice;
        if (oldprice > 4000){
            offprice = (int) (0.9 * oldprice);
        }else {
            offprice = oldprice;
        }
        return offprice;
    }
}
