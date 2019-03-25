package com.example.lingard.ipctest.SRP;

/**
 * Created by lingard on 2019/2/28.
 */

public class Client {

    public static void main(String[] args){
        IUserInfo userInfo = new UserInfo();
        IUserBo userBo = (IUserBo) userInfo;
        userBo.setUserpassword("...");
    }
}
