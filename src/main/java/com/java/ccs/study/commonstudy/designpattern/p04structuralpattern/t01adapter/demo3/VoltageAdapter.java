package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo3;

import java.text.MessageFormat;

/**
 * @Author: Cao.cs
 * @Date: Created in 18:45 2022/5/8
 * 适配器，220V电源->5V电源
 * 对象适配器模式：持有src类的实例的方式。
 */
public class  VoltageAdapter  implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    /**
     * @return 适配器，将原来Voltage220V类的输出220V电压的方法，转换成输出5V电压的方法。
     */
    @Override
    public int outPut5V() {
        int voltageSrc = voltage220V.outPut220V();
        System.out.println(MessageFormat.format("原电压={0}", voltageSrc));
        int voltageDst = voltageSrc / 44;
        System.out.println(MessageFormat.format("适配器转换后电压={0}", voltageDst));
        return voltageDst;
    }


}
