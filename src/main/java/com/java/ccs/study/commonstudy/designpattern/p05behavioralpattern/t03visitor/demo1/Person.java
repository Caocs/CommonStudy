package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t03visitor.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:54 2022/5/12
 * 被访问者：定义一个accept方法，接受一个访问者对象
 *
 *
 */
public abstract class Person {
    public abstract void accept(Action action);
}
