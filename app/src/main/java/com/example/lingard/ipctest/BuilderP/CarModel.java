package com.example.lingard.ipctest.BuilderP;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/4.
 */

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();
    abstract void start();
    abstract void stop();
    abstract void alarm();
    abstract void emgineboom();

    final void run() {
        for (int i = 0; i < sequence.size(); i++){
            String actionName = sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();  //启动汽车
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop(); //停止汽车
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm(); //喇叭开始叫了
            }else if(actionName.equalsIgnoreCase("engine boom")){
                //如果是engine boom关键字
                this.emgineboom();  //引擎开始轰鸣
            }
        }
    }

    boolean isAlarm() {
        return true;
    }

    public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
