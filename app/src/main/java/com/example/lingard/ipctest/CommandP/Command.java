package com.example.lingard.ipctest.CommandP;

/**
 * Created by lingard on 2019/3/8.
 */

public abstract class Command {
    protected Receiver receiver;
    protected RequirementReceiver requirementReceiver = new RequirementReceiver();
    protected PageReceiver pageReceiver = new PageReceiver();
    protected CodeReceiver codeReceiver = new CodeReceiver();

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void exe();
}
