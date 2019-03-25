package com.example.lingard.ipctest.InterpreterP;

import java.util.HashMap;

/**
 * Created by lingard on 2019/3/21.
 */

public class VarExpression extends Expression {
    private String key;
    public VarExpression(String _key){
        this.key = _key;
    }
    //从map中取之
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }}
