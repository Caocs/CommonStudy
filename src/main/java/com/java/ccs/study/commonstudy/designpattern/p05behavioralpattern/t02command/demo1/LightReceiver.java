package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t02command.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:00 2022/5/11
 * 被调用者
 */
public class LightReceiver {
    public void on() {
        System.out.println("电灯打开了...");
    }

    public void off() {
        System.out.println("电灯关闭了...");
    }
}
