package com.example.lingard.ipctest.MementoP;

/**
 * Created by lingard on 2019/3/18.
 */

class Memento implements IMemento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
