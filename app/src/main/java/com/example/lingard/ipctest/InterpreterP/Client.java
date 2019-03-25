package com.example.lingard.ipctest.InterpreterP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by lingard on 2019/3/21.
 */

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //赋值
        HashMap<String,Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为："+expStr +"="+cal.run(var));
    }

    private static HashMap<String, Integer> getValue(String expStr) throws IOException{
        HashMap<String, Integer> map = new HashMap<>();
        for (char c : expStr.toCharArray() ){
            if (c != '+' && c!= '-'){
                if (!map.containsKey(String.valueOf(c))){
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(in),Integer.valueOf(in));
                }
            }
        }
        return map;
    }

    private static String getExpStr() throws IOException{
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
