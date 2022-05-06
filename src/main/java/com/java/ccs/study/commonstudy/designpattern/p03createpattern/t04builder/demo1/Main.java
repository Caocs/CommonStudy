package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:39 2022/5/6
 */
public class Main {

    /**
     * 需求：
     * 需要建房子：这一过程为打桩、砌墙、封顶。
     * 但是房子各种各样，过程虽然一样，但每一步要求不尽相同。
     * 传统方法：
     * 缺点：将产品和创建产品的过程封装在一起，耦合性增强了。
     * 解决方法：
     * 将产品和产品建造过程解耦 -> 建造者模式。
     */
    public static void main(String[] args) {
        AbstractHouse house = new CommonHouse();
        house.build();
    }
}
