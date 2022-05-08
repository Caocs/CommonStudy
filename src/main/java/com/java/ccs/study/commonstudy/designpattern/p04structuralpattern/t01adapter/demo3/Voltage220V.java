package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo3;

import java.text.MessageFormat;

/**
 * @Author: Cao.cs
 * @Date: Created in 18:45 2022/5/8
 * 被适配者，220V电源
 */
public class Voltage220V {

    /**
     * @return 输出220V电压
     */
    public int outPut220V() {
        int src = 220;
        System.out.println(MessageFormat.format("电压={0}", src));
        return src;
    }

}
