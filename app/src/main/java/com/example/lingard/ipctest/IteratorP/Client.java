package com.example.lingard.ipctest.IteratorP;

/**
 * Created by lingard on 2019/3/13.
 * 迭代器模式提供了遍历容器的方便性，容器只要管理增减元素就可以了，需要遍历时交
 由迭代器进行
 */

public class Client {
    public static void main(String[] args){
        IProject project = new Project();
        //增加星球大战项目
        project.add("星球大战项目ddddd",10,100000);
        //增加扭转时空项目
        project.add("扭转时空项目",100,10000000);
        //增加超人改造项目
        project.add("超人改造项目",10000,1000000000);
        //这边100个项目
        for(int i=4;i<104;i++){
            project.add("第"+i+"个项目",i*5,i*1000000);
        }
        IProjectIterator projectIterator = project.iterator();
        while(projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
