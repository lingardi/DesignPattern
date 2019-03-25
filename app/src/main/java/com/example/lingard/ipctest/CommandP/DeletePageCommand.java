package com.example.lingard.ipctest.CommandP;

/**
 * Created by lingard on 2019/3/8.
 */

public class DeletePageCommand extends Command {

    public DeletePageCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void exe() {
        super.pageReceiver.find();
        super.requirementReceiver.delete();
        super.requirementReceiver.plan();
    }
}
