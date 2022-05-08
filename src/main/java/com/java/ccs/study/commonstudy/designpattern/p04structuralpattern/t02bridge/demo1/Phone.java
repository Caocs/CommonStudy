package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t02bridge.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:00 2022/5/8
 * 该类充当桥的作用，
 * 把品类 和 品牌功能进行桥接。
 */
public class Phone {
    /**
     * 组合的方式，引入各个品牌手机的可操作行为接口。
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call() {
        this.brand.call();
    }


    protected void open() {
        this.brand.open();
    }


    protected void close() {
        this.brand.close();
    }

}
