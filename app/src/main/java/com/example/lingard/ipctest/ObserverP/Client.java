package com.example.lingard.ipctest.ObserverP;

import java.util.*;

/**
 * Created by lingard on 2019/3/15.
 * 关联行为场景。需要注意的是，关联行为是可拆分的，而不是“组合”关系。
   事件多级触发场景。
   跨系统的消息交换场景，如消息队列的处理机制。
 */

public class Client {
    public static void main(String[] args){
        Hanfeizi hanfeizi = new Hanfeizi();
        java.util.Observer observer = new Liusi();
        hanfeizi.addObserver(observer);
        Observer observer1 = new Lisi();
//        hanfeizi.addObserver(observer1);
        hanfeizi.havebreakfast();
    }
}
