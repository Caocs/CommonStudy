package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:40 2022/5/9
 * 【立体声】
 */
public class Stereo {
    private static Stereo stereo = new Stereo();

    public static Stereo getInstance() {
        return stereo;
    }

    public void on() {
        System.out.println("打开立体声...");
    }

    public void off() {
        System.out.println("关闭立体声...");
    }

    public void setVolume(Integer volume) {
        System.out.println("立体声音量+" + volume + "...");
    }
}
