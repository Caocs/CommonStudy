package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t08interpreter.delm1;

import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:06 2022/5/15
 * 变量解释器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
