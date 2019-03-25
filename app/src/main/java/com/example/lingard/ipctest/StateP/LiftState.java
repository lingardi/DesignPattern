package com.example.lingard.ipctest.StateP;

/**
 * Created by lingard on 2019/3/20.
 */

public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void stop();
    public abstract void run();
}
