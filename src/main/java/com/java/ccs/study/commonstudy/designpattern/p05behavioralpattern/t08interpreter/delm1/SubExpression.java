package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t08interpreter.delm1;

import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:03 2022/5/15
 * 减法解释器
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相减
     */
    @Override
    public int interpret(Map<String, Integer> var) {
        return super.left.interpret(var) - super.right.interpret(var);
    }
}
