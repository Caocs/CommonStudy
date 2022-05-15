package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t07memento.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:47 2022/5/15
 * 备忘录对象
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
