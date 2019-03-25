package com.example.lingard.ipctest.FlyweightP;

/**
 * Created by lingard on 2019/3/21.
 */

public class Sign4Info extends SignInfo {
    private String key;

    public Sign4Info(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
