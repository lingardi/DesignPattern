package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

import com.example.lingard.ipctest.AdapterP.ClassAdapter.IUserInfo;

/**
 * Created by lingard on 2019/3/13.
 */

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        return null;
    }

    @Override
    public String getMobileNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
