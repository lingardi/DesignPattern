package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lingard on 2019/3/13.
 */

public class OuterUserInfo implements IUserInfo {
    private OuterBaseInfo baseInfo;
    private OuterOfficeInfo officeInfo;
    private OuterHomeInfo homeInfo;

    private Map basemap;
    private Map officemap;
    private Map homemap;

    public OuterUserInfo(IOuterBaseInfo baseInfo, IOuterHomeInfo homeInfo, IOuterOfficeInfo officeInfo){
        this.baseInfo = (OuterBaseInfo) baseInfo;
        this.officeInfo = (OuterOfficeInfo) officeInfo;
        this.homeInfo = (OuterHomeInfo) homeInfo;

        this.basemap = baseInfo.getUserBaseInfo();
        this.homemap = this.homeInfo.getUserHomeInfo();
        this.officemap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        return basemap.get("userName").toString();
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
