package com.example.lingard.ipctest.InterpreterP;

import java.util.HashMap;

/**
 * Created by lingard on 2019/3/21.
 */

public abstract class Expression {
    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
