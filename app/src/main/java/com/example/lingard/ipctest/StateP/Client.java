package com.example.lingard.ipctest.StateP;

/**
 * Created by lingard on 2019/3/20.
 * 环境角色context有两个不成文的约束：1)把状态对象声明为静态常量，有几个状态对象就声明几个静态常量。
 * 2)环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式。
 * 策略模式的环境角色只是一个委托作用，负责算法的替换；而状态模式的环境角色不仅仅是委托行为，
 * 它还具有登记状态变化的功能
 */

public class Client {
    public static void main(String[] args){
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.run();
    }
}
