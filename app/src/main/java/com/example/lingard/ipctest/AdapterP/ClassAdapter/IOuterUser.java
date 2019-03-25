package com.example.lingard.ipctest.AdapterP.ClassAdapter;

import java.util.Map;

/**
 * Created by lingard on 2019/3/13.
 */

public interface IOuterUser {
    //基本信息，比如名称、性别、手机号码等
    public Map getUserBaseInfo();
    //工作区域信息
    public Map getUserOfficeInfo();
    //用户的家庭信息
    public Map getUserHomeInfo();
}
