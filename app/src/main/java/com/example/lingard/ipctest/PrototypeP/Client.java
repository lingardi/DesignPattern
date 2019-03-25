package com.example.lingard.ipctest.PrototypeP;

/**
 * Created by lingard on 2019/3/7.
 * 浅拷贝：对象内部数组和引用对象不能拷贝，只复制引用，基本数据类型和String可以，打印值为【li,hi】
 * 深拷贝：该代码中实现方式，克隆对象和原型对象无干扰
 * clone不能与final共存，需要能重新赋值的
 */

public class Client {
    public static void main(String[] args){
        Mail mail = new Mail(new AdvTemplate());
        mail.setValue("li");
        Mail mail1 = mail.clone();
        mail1.setValue("hi");
        System.out.println(mail.getValue());
    }
}
