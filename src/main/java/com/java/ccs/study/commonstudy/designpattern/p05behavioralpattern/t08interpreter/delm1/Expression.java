package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t08interpreter.delm1;

import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:00 2022/5/15
 * 抽象表达式类
 */
public abstract class Expression {

    /**
     * a + b - c
     * 解释公式和数值，key就是公式（表达式）参数[a, b, c]，value就是具体值
     * HashMap{a=10, b=20}
     * 通过HashMap键值对，可以获取到变量的值。
     */
    public abstract int interpret(Map<String, Integer> var);
}
