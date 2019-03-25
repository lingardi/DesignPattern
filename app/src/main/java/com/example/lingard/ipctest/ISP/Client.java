package com.example.lingard.ipctest.ISP;

/**
 * Created by lingard on 2019/3/1.
 */

public class Client {

    public static void main(String[] args){
        IPrettyGirl xixi = new PrettyGirl("xixi");
        AbstractSearcher searcher = new Searcher(xixi);
        searcher.show();
    }
}
