package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:41 2022/5/9
 * 【灯光】
 */
public class TheaterLights {
    private static TheaterLights lights = new TheaterLights();

    public static TheaterLights getInstance() {
        return lights;
    }

    public void on() {
        System.out.println("打开灯光...");
    }

    public void off() {
        System.out.println("关闭灯光...");
    }

    public void dim() {
        System.out.println("调暗灯光...");
    }

    public void bright() {
        System.out.println("调亮灯光...");
    }
}
