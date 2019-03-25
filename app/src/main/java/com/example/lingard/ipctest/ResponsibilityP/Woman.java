package com.example.lingard.ipctest.ResponsibilityP;

/**
 * Created by lingard on 2019/3/9.
 */

public class Woman implements IWoman {
    private int type;
    private String request = "我要去逛街";

    public Woman(int type, String request){
        this.type = type;
        this.request = request;
        switch (type){
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
        }
    }
    @Override
    public int gettype() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
