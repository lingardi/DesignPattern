package com.example.lingard.ipctest.InterpreterP;

/**
 * Created by lingard on 2019/3/21.
 */

public abstract class SympolExpression extends Expression {
    protected Expression left;
    protected Expression right;
    //所有的解析公式都应只关心自己左右两个表达式的结果
    public SympolExpression(Expression _left,Expression _right){
        this.left = _left;
        this.right = _right;
    }
}
