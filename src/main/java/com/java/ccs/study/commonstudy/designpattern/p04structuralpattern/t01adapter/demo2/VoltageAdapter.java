package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo2;

import java.text.MessageFormat;

/**
 * @Author: Cao.cs
 * @Date: Created in 18:45 2022/5/8
 * 适配器，220V电源->5V电源
 * 类适配器模式：继承src类的方式。
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    /**
     * @return 适配器，将原来Voltage220V类的输出220V电压的方法，转换成输出5V电压的方法。
     */
    @Override
    public int outPut5V() {
        int voltageSrc = super.outPut220V();
        System.out.println(MessageFormat.format("原电压={0}", voltageSrc));
        int voltageDst = voltageSrc / 44;
        System.out.println(MessageFormat.format("适配器转换后电压={0}", voltageDst));
        return voltageDst;
    }


}
