package com.example.lingard.ipctest.TemplateMethodP;

/**
 * Created by lingard on 2019/3/4.
 */

public abstract class CarModel {
    abstract void start();
    abstract void stop();
    abstract void alarm();
    abstract void emgineboom();

    final void run() {
        this.start();
        this.emgineboom();
        this.alarm();
        this.stop();
    }

    boolean isAlarm() {
        return true;
    }
}
