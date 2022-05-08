package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t02bridge.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:01 2022/5/8
 */
public class XiaoMi implements Brand {
    @Override
    public void call() {
        System.out.println("XiaoMi call");
    }

    @Override
    public void open() {
        System.out.println("XiaoMi open");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi close");
    }
}
