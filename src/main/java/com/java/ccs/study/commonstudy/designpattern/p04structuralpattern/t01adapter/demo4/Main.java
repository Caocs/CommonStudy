package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo4;

/**
 * @Author: Cao.cs
 * @Date: Created in 19:20 2022/5/8
 */
public class Main {

    /**
     * 接口适配器模式：
     * (1)又称缺省适配器模式。
     * (2)当不需要全部实现接口提供的方法时，可以先设计一个抽象类实现接口，并为该接口中的每个方法提供一个默认实现(空方法)，
     * 那么该抽象类的子类可有选择地覆盖父类的某些方法类实现需求。
     * (3)适用于一个接口不想使用其所有的方法的情况
     */
    public static void main(String[] args) {
        new AbstractAdapter() {
            /**
             * 在使用时，只想重写function1()方法即可。
             */
            @Override
            public void function1() {
                super.function1();
            }
        };
    }

}
