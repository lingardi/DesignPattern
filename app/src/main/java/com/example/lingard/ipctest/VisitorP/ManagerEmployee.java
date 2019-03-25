package com.example.lingard.ipctest.VisitorP;

/**
 * Created by lingard on 2019/3/19.
 */

public class ManagerEmployee extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
