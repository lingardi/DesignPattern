package com.example.lingard.ipctest.ResponsibilityP;

/**
 * Created by lingard on 2019/3/9.
 */

public class Father extends Handler {
    @Override
    protected void response(IWoman woman) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(woman.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }

    @Override
    protected int getHandlerLevel() {
        return 1;
    }
}
