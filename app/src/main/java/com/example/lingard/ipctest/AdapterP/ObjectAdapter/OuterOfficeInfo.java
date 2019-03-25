package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lingard on 2019/3/13.
 */

public class OuterOfficeInfo implements IOuterOfficeInfo {
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
