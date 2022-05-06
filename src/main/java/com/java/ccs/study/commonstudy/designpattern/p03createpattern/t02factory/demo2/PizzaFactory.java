package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo2;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.CheesePizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.GreekPizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.PizzaType;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:37 2022/5/5
 */
public class PizzaFactory {



    public static Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (PizzaType.greek.equals(pizzaType)) {
            pizza = new GreekPizza();
        } else if (PizzaType.cheese.equals(pizzaType)) {
            pizza = new CheesePizza();
        } else {
            pizza = new GreekPizza();
        }
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
