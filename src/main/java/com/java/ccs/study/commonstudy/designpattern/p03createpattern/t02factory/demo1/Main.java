package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo1;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.CheesePizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.GreekPizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:37 2022/5/5
 */
public class Main {

    /**
     * 一般写法：
     * 缺点：
     * 创建Pizza的过程，违反了设计模式的开闭原则。
     * -> 把创建Pizza对象封装到一个类中，这样有新的Pizza类，只需要修改该类即可。
     */
    public static void main(String[] args) {

        Pizza pizza = orderPizza("greek");
        pizza.prepare();
        pizza.cut();
        pizza.box();

    }

    private static Pizza orderPizza(String orderType) {
        Pizza pizza = null;
        if (orderType == "greek") {
            pizza = new GreekPizza();
        } else if (orderType == "cheese") {
            pizza = new CheesePizza();
        }
        return pizza;
    }

}
