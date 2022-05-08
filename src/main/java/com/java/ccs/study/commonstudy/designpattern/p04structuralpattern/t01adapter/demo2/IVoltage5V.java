package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 18:45 2022/5/8
 * 被适配者，220V电源
 */
public interface IVoltage5V {
    /**
     *
     * @return 手机只能接受5V的电压，定义接收5V电压的方法。
     */
     int outPut5V();
}
