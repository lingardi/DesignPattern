package com.example.lingard.ipctest.ISP;

/**
 * Created by lingard on 2019/3/1.
 */

public abstract class AbstractSearcher {
    IPrettyGirl prettyGirl;
    public AbstractSearcher(IPrettyGirl prettyGirl){
        this.prettyGirl = prettyGirl;
    }
    public abstract void show();
}
