package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

import com.example.lingard.ipctest.AdapterP.ClassAdapter.*;
import com.example.lingard.ipctest.AdapterP.ClassAdapter.IUserInfo;
import com.example.lingard.ipctest.AdapterP.ClassAdapter.OuterUserInfo;

/**
 * Created by lingard on 2019/3/13.
 */

public class Client {
    public static void main(String[] args){
        com.example.lingard.ipctest.AdapterP.ObjectAdapter.IUserInfo boy = (com.example.lingard.ipctest.AdapterP.ObjectAdapter.IUserInfo) new UserInfo();
        IUserInfo girl = new OuterUserInfo();
        for (int i=0;i<101;i++){
            boy.getUserName();
            girl.getMobileNumber();
        }
    }
}
