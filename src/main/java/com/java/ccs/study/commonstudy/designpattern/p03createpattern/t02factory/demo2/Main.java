package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo2;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.PizzaType;

import java.util.Calendar;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:37 2022/5/5
 */
public class Main {

    /**
     * 简单工厂模式：
     * 定义一个创建对象的类，由这个类来封装实例化对象的行为。
     * <p>
     * 例子：
     * Calendar类中，就使用了简单工厂模式。
     */
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.createPizza(PizzaType.greek);

        Calendar.getInstance();
    }

}
