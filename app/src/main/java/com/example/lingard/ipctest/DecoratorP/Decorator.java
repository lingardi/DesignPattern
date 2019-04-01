package com.example.lingard.ipctest.DecoratorP;

/**
 * Created by lingard on 2019/3/11.
 * 原始方法和装饰方法的执行顺序在具体的装饰类是固定的，可以通过方法重载实现多种执行顺序。
 * 装饰模式是代理模式的特殊应用，侧重于对类功能的加强或减弱，代理模式侧重于对代理过程的控制
 */

public abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
        // TODO Auto-generated constructor stub
    }
    @Override
    public void report() {
        // TODO Auto-generated method stub
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        // TODO Auto-generated method stub
        this.schoolReport.sign(name);
    }
}
