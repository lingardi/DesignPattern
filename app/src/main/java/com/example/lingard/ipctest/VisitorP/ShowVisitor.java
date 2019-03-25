package com.example.lingard.ipctest.VisitorP;

/**
 * Created by lingard on 2019/3/19.
 */

public class ShowVisitor implements IShowVisitor {
    private String info;

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = info + this.getBasicInfo(commonEmployee) + commonEmployee.getJob();
    }

    @Override
    public void visit(ManagerEmployee managerEmployee) {
        this.info = info + this.getBasicInfo(managerEmployee) + managerEmployee.getPerformance();
    }

    @Override
    public void report() {
        System.out.println(this.info);
    }

    public String getBasicInfo(Employee employee){
        return employee.getName()+employee.getSex()+employee.getSalary();
    }
}
