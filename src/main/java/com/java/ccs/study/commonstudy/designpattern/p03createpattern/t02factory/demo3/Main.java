package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo3;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.PizzaType;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:37 2022/5/5
 */
public class Main {

    /**
     * 需求：
     * 披萨不仅有不同种类(greek,cheese),现在每个种类又分不同地区(beijing,shanghai).
     * <p>
     * 工厂方法模式：
     * 定义一个创建对象的抽象方法，由子类决定实例化的类。工厂方法模式将对象的实例化推迟到子类。
     */
    public static void main(String[] args) {
        PizzaFactory factory = new BJPizzaFactory();
        factory.createPizza(PizzaType.greek);
    }

}
