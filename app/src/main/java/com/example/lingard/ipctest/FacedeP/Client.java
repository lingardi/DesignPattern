package com.example.lingard.ipctest.FacedeP;

import com.example.lingard.ipctest.ObserverP.Hanfeizi;
import com.example.lingard.ipctest.ObserverP.Lisi;
import com.example.lingard.ipctest.ObserverP.Liusi;

import java.util.Observer;

/**
 * Created by lingard on 2019/3/15.
 *门面模式最大的缺点就是不符合开闭原则，类的关联
 * 在门面模式中，门面角色应该是稳定，它不应该经常变化
 */

public class Client {
    public static void main(String[] args){
        Facede facede = new Facede();
        facede.methodA("","");
    }
}
