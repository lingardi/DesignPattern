package com.example.lingard.ipctest.StrategyP;

/**
 * Created by lingard on 2019/3/11.
 * 如果系统中的一个策略家族的具体策略数量超过4个，则需要考虑使用混合模式，解决
 策略类膨胀和对外暴露的问题
 */

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个


        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new Strategy1()); //拿到妙计
        context.operate();  //拆开执行
        System.out.println("\n\n\n\n\n\n\n\n");
        //刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new Strategy2());
        context.operate();  //执行了第二个锦囊
        System.out.println("\n\n\n\n\n\n\n\n");
        //孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new Strategy3());
        context.operate();  //孙夫人退兵
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
