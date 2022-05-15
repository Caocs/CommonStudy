package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t07memento.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:47 2022/5/15
 * 源对象
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return 根据自身对象状态，创建备份数据对象。
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * @param memento 从备份对象中，恢复到当时的状态。
     */
    public void revertStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
