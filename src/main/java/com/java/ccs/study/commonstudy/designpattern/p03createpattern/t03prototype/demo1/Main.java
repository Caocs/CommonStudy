package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.demo1;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.model.Sheep;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:55 2022/5/5
 */
public class Main {

    /**
     * 一般写法：
     * 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂，效率较低。
     * -> 改进思路
     * Java中Object类是所有类的基类，Object类提供了一个clone()方法，该方法可以将一个Java对象复制一份，
     * 但是需要实现clone的Java类必须要实现一个借口Cloneable，该接口表示该类能够复制且具有复制的能力。
     */
    public static void main(String[] args) {
        Sheep sheep = new Sheep("a", 1, "red");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor()); // 实现克隆一个对象。
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
