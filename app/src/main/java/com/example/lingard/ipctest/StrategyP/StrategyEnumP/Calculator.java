package com.example.lingard.ipctest.StrategyP.StrategyEnumP;

import com.example.lingard.ipctest.StrategyP.Strategy;

/**
 * Created by lingard on 2019/3/11.
 */

public enum Calculator {

    Add("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    //减法运算
    Sub("-"){
        public int exec(int a,int b){
            return a-b;
        }
    };

    String string;
    Calculator(String s) {
        this.string = s;
    }

    //获得枚举成员的值
    public String getValue(){
        return this.string;
    }
    //声明一个抽象函数
    public abstract int exec(int a,int b);
}
