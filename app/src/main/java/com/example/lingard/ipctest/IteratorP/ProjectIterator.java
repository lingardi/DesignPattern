package com.example.lingard.ipctest.IteratorP;

import java.util.ArrayList;

/**
 * Created by lingard on 2019/3/13.
 */

public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projects = new ArrayList<>();
    private int currentItem = 0;
    public ProjectIterator(ArrayList<IProject> project){
        this.projects = project;
    }
    @Override
    public boolean hasNext() {
        if ( currentItem >= projects.size() || this.projects.get(this.currentItem) == null)
            return false;
        else
            return true;
    }

    @Override
    public IProject next() {
        return this.projects.get(this.currentItem++);
    }

    @Override
    public void remove() {

    }
}
