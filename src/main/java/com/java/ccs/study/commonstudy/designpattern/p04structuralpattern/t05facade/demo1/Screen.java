package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:40 2022/5/9
 * 【荧幕】
 */
public class Screen {
    private static Screen screen = new Screen();

    public static Screen getInstance() {
        return screen;
    }

    public void up() {
        System.out.println("升起荧幕...");
    }

    public void down() {
        System.out.println("拉下荧幕...");
    }
}
