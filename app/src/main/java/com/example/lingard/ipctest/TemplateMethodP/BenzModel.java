package com.example.lingard.ipctest.TemplateMethodP;

/**
 * Created by lingard on 2019/3/4.
 */

public class BenzModel extends CarModel {
    @Override
    void start() {

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

    protected boolean isAlarm() {
        return false;
    }
}
