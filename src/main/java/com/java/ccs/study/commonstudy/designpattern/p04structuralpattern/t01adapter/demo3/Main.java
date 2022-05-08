package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo3;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:19 2022/5/7
 */
public class Main {

    /**
     * 对象适配器模式
     * 基本介绍：
     * 基本思路和类适配器模式相同，只是将Adapter类做修改，不是继承src类，而是持有src类的实例，以解决兼容性问题。
     * 即：持有src类，实现dst接口，完成src->dst的适配。
     * 注意：
     * (1)根据"合成复用原则"，在系统中尽量使用关联关系替代继承关系。
     * (2)对象适配器模式->是适配器模式常用的一种。
     */
    public static void main(String[] args) {
        IVoltage5V voltage5V = new VoltageAdapter(new Voltage220V());
        Phone phone = new Phone();
        phone.charging(voltage5V);
    }

}
