package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo3;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.BJCheesePizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.BJGreekPizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.PizzaType;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:19 2022/5/5
 */
public class BJPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (PizzaType.greek.equals(pizzaType)) {
            pizza = new BJGreekPizza();
        } else if (PizzaType.cheese.equals(pizzaType)) {
            pizza = new BJCheesePizza();
        } else {
            pizza = new BJGreekPizza();
        }
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
