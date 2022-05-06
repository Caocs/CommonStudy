package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:32 2022/5/5
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
