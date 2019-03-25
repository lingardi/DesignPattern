package com.example.lingard.ipctest.ResponsibilityP;

/**
 * Created by lingard on 2019/3/9.
 */

public class Husband extends Handler {
    @Override
    protected void response(IWoman woman) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(woman.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }

    @Override
    protected int getHandlerLevel() {
        return 2;
    }
}
