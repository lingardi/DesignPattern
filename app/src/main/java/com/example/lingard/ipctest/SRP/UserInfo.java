package com.example.lingard.ipctest.SRP;

/**
 * Created by lingard on 2019/2/28.
 */

public class UserInfo implements IUserInfo,IUserBo,IUserBiz{
    IUserInfo userInfo = new UserInfo();
    IUserBo iUserBo = (IUserBo) userInfo;
    IUserBiz iUserBiz = new UserInfo();

    @Override
    public void setUserId(String id) {
        iUserBo.setUserId(id);
    }

    @Override
    public void setUserpassword(String psd) {
        iUserBo.setUserpassword("acb");
    }

    @Override
    public void deleteUser(IUserBo userBo) {
        iUserBiz.deleteUser(userBo);
    }

    @Override
    public void changepassword(IUserBo userBo, String npsd) {
        iUserBiz.changepassword(userBo, npsd);
    }
}
