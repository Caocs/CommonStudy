package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t03visitor.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:52 2022/5/12
 * 抽象访问者
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男生给了通过");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女生给了通过");
    }

}
