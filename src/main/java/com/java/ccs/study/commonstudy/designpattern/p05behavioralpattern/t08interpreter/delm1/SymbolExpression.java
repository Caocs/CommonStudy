package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t08interpreter.delm1;

import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:01 2022/5/15
 * 抽象运算符号解释器
 * 这里每个运算符号，都只和自己左右两个数字有关系，
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 因为SymbolExpression 是让其子类来实现，因此interpreter是一个默认实现
     *
     */
    @Override
    public int interpret(Map<String, Integer> var) {
        return 0;
    }
}
