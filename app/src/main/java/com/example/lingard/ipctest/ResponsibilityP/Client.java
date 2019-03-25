package com.example.lingard.ipctest.ResponsibilityP;

import com.example.lingard.ipctest.ProxyP.NormalProxy.GamePlayerProxy;
import com.example.lingard.ipctest.ProxyP.NormalProxy.IGamePlayer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lingard on 2019/3/6.
 */

public class Client {
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<IWoman> arrayList = new ArrayList();
        for(int i=0;i<5;i++){
            arrayList.add(new Woman(rand.nextInt(4),"我要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for(IWoman woman:arrayList) {
            father.handlerMessage(woman);
        }
    }

}
