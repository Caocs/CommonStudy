package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t03visitor.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:54 2022/5/12
 * 被访问者：
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
