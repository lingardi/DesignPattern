package com.example.lingard.ipctest.IteratorP;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/13.
 */

public class Project implements IProject {
    private ArrayList<IProject> projects = new ArrayList<>();
    private String name = "";
    //项目成员数量
    private int num = 0;
    //项目费用
    private int cost = 0;
    public Project(){}
    public Project(String name, int num, int cost){
        this.name = name;
        this.num = num;
        this.cost = cost;
    }
    @Override
    public void add(String name, int num, int cost) {
        projects.add(new Project(name,num, cost));
    }

    @Override
    public String getProjectInfo() {
        return this.name+this.num+this.cost;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}
