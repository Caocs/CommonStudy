package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t03visitor.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:54 2022/5/12
 * 被访问者：
 */
public class Man extends Person {

    /**
     * 该例中我们使用到了双分派：
     * 第一次分派：首先在客户端程序中，将具体状态作为参数传递Woman中
     * 第二次分派：然后Woman类调用作为参数的具体方法getWomanResult，同时将自己this作为参数传入
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
