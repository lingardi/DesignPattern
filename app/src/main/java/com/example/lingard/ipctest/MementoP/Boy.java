package com.example.lingard.ipctest.MementoP;

/**
 * Created by lingard on 2019/3/15.
 */

public class Boy {
    private String state = "";
    private String state1 = "";
    private String state2 = "";
    public String getState(){
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState1() {
        return state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public IMemento createMemento(){
        return new Memento(this.state);
    }
    public void restoreMemento(Memento _memento){
        this.setState(_memento.getState());
    }
}
