package com.example.lingard.ipctest.CommandandResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lingard on 2019/3/29.
 */

public class Client {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while(true){
            //UNIX下的默认提示符号
            System.out.print("#");
            //捕获输出
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            //输入quit或exit则退出
            if(input.equals("quit") || input.equals("exit")){
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}
