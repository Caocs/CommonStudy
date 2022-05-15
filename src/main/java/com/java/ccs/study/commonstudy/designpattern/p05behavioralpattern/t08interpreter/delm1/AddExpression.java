package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t08interpreter.delm1;

import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:01 2022/5/15
 *加法解释器
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相加
     */
    @Override
    public int interpret(Map<String, Integer> var) {
        return super.left.interpret(var) + super.right.interpret(var);
    }
}
