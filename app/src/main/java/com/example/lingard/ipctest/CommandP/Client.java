package com.example.lingard.ipctest.CommandP;

import com.example.lingard.ipctest.BuilderP.Director;

/**
 * Created by lingard on 2019/3/4.
 * Invoker为负责人, Receiver里可以设置回滚命令应对撤销命令的操作
 * 封闭Receiver方式：CongreteCommand可以设置默认接收者，以减少Client对接收者的依赖
 * 命令和接收者都以抽象类表示，命令类和接收者为聚合关系，Invoker为命令传达者，
 * 与command为聚合关系
 */


public class Client {
    public static void main(String[] args){
        Invoker lmw = new Invoker();
        Command command = new AddRequirementCommand();
        lmw.setCommand(command);
        lmw.action();
    }
}
