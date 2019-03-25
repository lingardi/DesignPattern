package com.example.lingard.ipctest.TemplateMethodP;

/**
 * Created by lingard on 2019/3/4.
 */

public class BMWModel extends CarModel {
    private boolean alarm;

    @Override
    protected void start() {

    }

    @Override
    void stop() {

    }

    @Override
    void alarm() {

    }

    @Override
    void emgineboom() {

    }

    protected boolean isAlarm(){
        return this.alarm;
    }

    public void setAlarm( boolean alarm ){
        this.alarm = alarm;
    }
}
