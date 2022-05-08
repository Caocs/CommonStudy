package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo3;

import java.text.MessageFormat;

/**
 * @Author: Cao.cs
 * @Date: Created in 18:48 2022/5/8
 */
public class Phone {


    /**
     * 充电方法
     * 依赖接口，不用依赖具体适配器类。
     */
    public void charging(IVoltage5V voltage5V) {
        int voltage = voltage5V.outPut5V();
        System.out.println(MessageFormat.format("正在使用{0}V电压充电中", voltage));
    }

}
