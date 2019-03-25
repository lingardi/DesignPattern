package com.example.lingard.ipctest.StrategyP.StrategyEnumP;

import java.util.Arrays;

/**
 * Created by lingard on 2019/3/11.
 * 策略枚举受枚举类型的限制，每个枚举项都是public、final、static的，扩展性受到了一定的约束,策略枚举一般
 担当不经常发生变化的角色。
 */

public class Client {
    public static void main(String[] args) {
    //输入的两个参数是数字
    int a = Integer.parseInt(args[0]);
    String symbol = args[1];  //符号
    int b = Integer.parseInt(args[2]);
             System.out.println("输入的参数为："+ Arrays.toString(args));
             System.out.println("运行结果为："+a+symbol+b+"="+Calculator.Add.exec(a,b));
}
}
