package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:20 2022/5/15
 * 抽象同事类
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public void sendMsg(Integer state) {
        this.getMediator().getMsg(state, this.getClass().getSimpleName());
    }
}
