package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

/**
 * Created by lingard on 2019/3/13.
 */

public interface IUserInfo {
    public String getUserName();
    //获得家庭地址
    public String getHomeAddress();
    //手机号码，这个太重要，手机泛滥呀
    public String getMobileNumber();
    //办公电话，一般是座机
    public String getOfficeTelNumber();
    //这个人的职位是什么
    public String getJobPosition();
    //获得家庭电话，这有点不好，我不喜欢打家庭电话讨论工作
    public String getHomeTelNumber();
}
