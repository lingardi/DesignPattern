package com.example.lingard.ipctest.CommandP;

/**
 * Created by lingard on 2019/3/8.
 */

public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.exe();
    }
}
