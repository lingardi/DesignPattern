package com.example.lingard.ipctest.VisitorP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingard on 2019/3/19.
 * 利用方法重载，多个访问者
 * 单分派语言处理一个操作是根据请求者的名称和接收到的参数决定的，在Java中有静态绑定和动态绑定
   之说，它的实现是依据重载（overload）和覆写（override）实现的
   双分派意味着得到执行的操作决定于请求的种类和两个接收者的类型
 */

public class Client {
    public static void main(String[] args){
       IShowVisitor showVisitor = new ShowVisitor();
       ITotalVisitor totalVisitor = new TotalVisitor();
        for(Employee emp:mockEmployee()){
            emp.accept(showVisitor);  //接受展示报表访问者
            emp.accept(totalVisitor);//接受汇总表访问者
        }
    }

    private static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");


        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        ManagerEmployee wangWu = new ManagerEmployee();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
