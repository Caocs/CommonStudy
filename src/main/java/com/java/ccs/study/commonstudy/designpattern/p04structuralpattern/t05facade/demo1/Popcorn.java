package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:41 2022/5/9
 * 【爆米花机器】
 */
public class Popcorn {
    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getInstance() {
        return popcorn;
    }

    public void on() {
        System.out.println("打开爆米花机器...");
    }

    public void off() {
        System.out.println("关闭爆米花机器...");
    }

    public void pop() {
        System.out.println("取出爆米花...");
    }
}
