package com.example.lingard.ipctest.ResponsibilityP;

/**
 * Created by lingard on 2019/3/9.
 */

public class Son extends Handler {
    @Override
    protected void response(IWoman woman) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(woman.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }

    @Override
    protected int getHandlerLevel() {
        return 3;
    }
}
