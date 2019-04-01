package com.example.lingard.ipctest.AdapterP.ClassAdapter;

/**
 * Created by lingard on 2019/3/13.
 * 对象适配器和类适配器的区别是：类适配器是类间继承，对象适配器是对象的合成关
 系，也可以说是类的关联关系，这是两者的根本区别。
 *接口和继承连接两个类
 */

public class Client {
    public static void main(String[] args){
        IUserInfo boy = new UserInfo();
        IUserInfo girl = new OuterUserInfo();
        for (int i=0;i<101;i++){
            boy.getUserName();
            girl.getMobileNumber();
        }
    }
}
