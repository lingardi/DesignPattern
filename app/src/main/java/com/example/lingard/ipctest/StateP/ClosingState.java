package com.example.lingard.ipctest.StateP;

/**
 * Created by lingard on 2019/3/20.
 */

class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);  //置为敞门状态
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);  //设置为停止状态
        super.context.getLiftState().stop();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState); //设置为运行状态
        super.context.getLiftState().run();
    }
}
