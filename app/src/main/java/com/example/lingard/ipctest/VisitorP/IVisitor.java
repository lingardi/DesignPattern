package com.example.lingard.ipctest.VisitorP;

/**
 * Created by lingard on 2019/3/19.
 */

public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);
    public void visit(ManagerEmployee managerEmployee);
}
