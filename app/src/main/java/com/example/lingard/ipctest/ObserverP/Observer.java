package com.example.lingard.ipctest.ObserverP;

import java.util.Observable;

/**
 * Created by lingard on 2019/3/15.
 */

public interface Observer {
    public void update(Observable observable, String content);
}
