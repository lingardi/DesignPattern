package com.example.lingard.ipctest.FlyweightP;

import java.util.HashMap;

/**
 * Created by lingard on 2019/3/21.
 * @Deprecated 注解：不能删除投产中代码，表示该方法或类已过时
 * 内部状态（SignInfo的属性）是对象可共享出来的信息，外部状态（HashMap中）是对象得以依赖的一个标记，
 */

public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key){
        SignInfo signInfo = null;
        if (!pool.containsKey(key)){
            System.out.println(key + "----建立对象，并放置到池中");
            signInfo = new Sign4Info(key);
            pool.put(key, signInfo);
        }else {
            signInfo = pool.get(key);
            System.out.println(key +"---直接从池中取得");
        }
        return signInfo;
    }
}
