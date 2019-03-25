package com.example.lingard.ipctest.SRP;

/**
 * Created by lingard on 2019/2/28.
 */

public interface IUserBiz extends IUserInfo {
    void deleteUser(IUserBo userBo);
    void changepassword(IUserBo userBo,String psd);
}
