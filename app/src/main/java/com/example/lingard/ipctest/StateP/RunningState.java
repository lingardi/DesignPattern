package com.example.lingard.ipctest.StateP;

/**
 * Created by lingard on 2019/3/20.
 */

class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);//环境设置为停止状态
        super.context.getLiftState().stop();
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }
}
