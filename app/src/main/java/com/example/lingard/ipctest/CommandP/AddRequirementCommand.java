package com.example.lingard.ipctest.CommandP;

/**
 * Created by lingard on 2019/3/8.
 */

public class AddRequirementCommand extends Command {
    public AddRequirementCommand(Receiver receiver) {
        super(receiver);
    }

//    public AddRequirementCommand(RequirementReceiver requirementReceiver){
//        super(requirementReceiver);
//    }
    //设置默认receiver
    public AddRequirementCommand(){
        super(new RequirementReceiver());
    }

    @Override
    public void exe() {
        super.requirementReceiver.find();
        super.requirementReceiver.add();
        super.requirementReceiver.plan();
    }
}
