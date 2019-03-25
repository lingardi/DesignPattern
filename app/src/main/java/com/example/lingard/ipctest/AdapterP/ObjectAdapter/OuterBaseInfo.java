package com.example.lingard.ipctest.AdapterP.ObjectAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lingard on 2019/3/13.
 */

public class OuterBaseInfo implements IOuterBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }
}
