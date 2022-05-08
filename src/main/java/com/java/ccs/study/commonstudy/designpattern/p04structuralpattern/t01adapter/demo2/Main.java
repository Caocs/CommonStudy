package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:19 2022/5/7
 */
public class Main {

    /**
     * 类适配器模式
     * 基本介绍：
     * Adapter类，通过继承src类，实现dst类接口，完成src->dst的适配。
     * 注意：
     * (1)Java是单继承机制，所以类适配器需要继承src类这一点算是一个缺点，因为这要求dst必须是接口，有一定局限性。
     * (2)src类的方法在Adapter中都会暴露出来，也增加了使用的成本。
     * (3)由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强了。
     */
    public static void main(String[] args) {
        IVoltage5V voltage5V = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(voltage5V);
    }

}
