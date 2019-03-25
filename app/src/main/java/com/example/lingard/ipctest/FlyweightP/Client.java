package com.example.lingard.ipctest.FlyweightP;

import com.example.lingard.ipctest.FactoryMethodP.AbstractFactory;
import com.example.lingard.ipctest.FactoryMethodP.FemaleBlack;
import com.example.lingard.ipctest.FactoryMethodP.FemaleFactory;

/**
 * Created by lingard on 2019/3/21.
 * 线程安全问题：设置的享元对象数量太少，导致每个线程都到对象池中获得对象，然后都去修改其属性，于是
 * 就出现一些不和谐数据，使用享元模式时，对象池中的享元对象尽量多
 * 性能平衡问题：尽量使用Java基本类型作为外部状态，若重新建立一个类为外部状态必须
 * 覆写equals方法和hashCode方法，而且执行效率还比较低
 *
 * 对象池着重在对象的复用上，池中的每个对象是可替换的，从同一个池中获得A对象和B对象
 * 对客户端来说是完全相同的，它主要解决复用，而享元模式在主要解决的对象的共享问题
 */

public class Client {
    public static void main(String[] args){
        //初始化对象池
        for(int i=0;i<4;i++){
            String subject = "科目" + i;
            //初始化地址
            for(int j=0;j<30;j++){
                String key = subject + "考试地点"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
