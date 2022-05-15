package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:20 2022/5/15
 * 抽象中介者
 */
public abstract class Mediator{

    public abstract void registerColleague(Colleague colleague);

    public abstract void getMsg(Integer state, String name);

    public abstract void sendMsg();
}
