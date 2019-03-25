package com.example.lingard.ipctest.AdapterP.ClassAdapter;

/**
 * Created by lingard on 2019/3/13.
 */

public class OuterUserInfo extends OuterUser implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println(getUserBaseInfo().get("userName").toString());
        return getUserBaseInfo().get("userName").toString();
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
