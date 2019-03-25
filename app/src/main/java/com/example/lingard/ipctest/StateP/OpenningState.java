package com.example.lingard.ipctest.StateP;

/**
 * Created by lingard on 2019/3/20.
 */

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeingState);
        super.context.getLiftState().close();
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
