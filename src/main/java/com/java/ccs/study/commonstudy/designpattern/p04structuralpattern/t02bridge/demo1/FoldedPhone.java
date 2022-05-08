package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t02bridge.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:06 2022/5/8
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("Folded");
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("Folded");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("Folded");
    }
}
