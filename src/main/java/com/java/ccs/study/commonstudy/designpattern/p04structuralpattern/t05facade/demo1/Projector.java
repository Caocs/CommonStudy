package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:40 2022/5/9
 * 【投影仪】
 */
public class Projector {
    private static Projector projector = new Projector();

    public static Projector getInstance() {
        return projector;
    }

    public void on() {
        System.out.println("打开投影仪...");
    }

    public void off() {
        System.out.println("关闭投影仪...");
    }

    public void focus() {
        System.out.println("投影仪聚焦...");
    }

    public void zoom() {
        System.out.println("投影仪放大...");
    }
}
