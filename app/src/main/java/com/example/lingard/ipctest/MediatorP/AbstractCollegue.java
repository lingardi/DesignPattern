package com.example.lingard.ipctest.MediatorP;

/**
 * Created by lingard on 2019/3/8.
 */

public abstract class AbstractCollegue {
    protected AbstractMediator abstractMediator;
    public AbstractCollegue(AbstractMediator abstractMediator){
        this.abstractMediator = abstractMediator;
    }
}
