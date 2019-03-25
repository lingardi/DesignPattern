package com.example.lingard.ipctest.StateP;

/**
 * Created by lingard on 2019/3/20.
 */

class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }
}
