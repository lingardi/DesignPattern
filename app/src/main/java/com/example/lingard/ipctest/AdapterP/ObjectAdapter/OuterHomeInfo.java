package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lingard on 2019/3/13.
 */

public class OuterHomeInfo implements IOuterHomeInfo {
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
