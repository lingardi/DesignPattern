package com.example.lingard.ipctest.VisitorP;

/**
 * Created by lingard on 2019/3/19.
 */

public class TotalVisitor implements ITotalVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    private int commonTotalsalary;
    private int managerTotalsalary;
    @Override
    public void visit(CommonEmployee commonEmployee) {
        commonTotalsalary = commonTotalsalary + commonEmployee.getSalary()*COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(ManagerEmployee managerEmployee) {
        this.managerTotalsalary = this.managerTotalsalary + managerEmployee.getSalary() *MANAGER_COEFFICIENT ;
    }

    @Override
    public void calculate() {
        System.out.println(this.commonTotalsalary+ this.managerTotalsalary);
    }
}
