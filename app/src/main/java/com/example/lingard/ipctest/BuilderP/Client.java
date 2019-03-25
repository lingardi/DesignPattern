package com.example.lingard.ipctest.BuilderP;

import com.example.lingard.ipctest.TemplateMethodP.*;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/4.
 */


public class Client {

    /**
     * 相同方法，不同执行顺序，结合模板方法run，工厂方法侧重于创建对象，建造器模式侧重于对象得装配工艺.
     */
    public static void main(String[] args){
//        BmwModel bmw = new BmwModel();
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("start");
//        sequence.add("engine boom");
//        sequence.add("stop");
//        bmw.setSequence(sequence);
//        bmw.run();

        Director director =new Director();
        for (int i = 0; i<100; i++){
            director.getAbenzModel().run();
        }
        for (int i = 0; i<1000; i++){
            director.getBbenzModel().run();
        }
    }
}
