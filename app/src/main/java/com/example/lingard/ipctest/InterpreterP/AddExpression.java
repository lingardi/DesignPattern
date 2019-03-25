package com.example.lingard.ipctest.InterpreterP;

import java.util.HashMap;

/**
 * Created by lingard on 2019/3/21.
 */

class AddExpression extends SympolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
