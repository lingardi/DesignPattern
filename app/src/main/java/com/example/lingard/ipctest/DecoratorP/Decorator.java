package com.example.lingard.ipctest.DecoratorP;

/**
 * Created by lingard on 2019/3/11.
 * 原始方法和装饰方法的执行顺序在具体的装饰类是固定的，可以通过方法重载实
 现多种执行顺序。
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
