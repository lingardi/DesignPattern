package com.example.lingard.ipctest.ResponsibilityP;

/**
 * Created by lingard on 2019/3/8.
 */

public abstract class Handler {
    private Handler handler;
    private int level;

    public void handlerMessage(IWoman woman) {
        if (woman.gettype() == this.getHandlerLevel()) {
            this.response(woman);
        } else {
            if (this.handler != null) {  //有后续环节，才把请求往后递送


                this.handler.handlerMessage(woman);
            } else { //已经没有后续处理人了，不用处理了
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }

    protected abstract void response(IWoman woman);

    //每个处理者都有一个处理级别
    protected abstract int getHandlerLevel();

    public void setNext(Handler _handler){
        this.handler = _handler;
    }
}
