package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo3;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.PizzaType;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.SHCheesePizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.SHGreekPizza;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:19 2022/5/5
 */
public class SHPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (PizzaType.greek.equals(pizzaType)) {
            pizza = new SHGreekPizza();
        } else if (PizzaType.cheese.equals(pizzaType)) {
            pizza = new SHCheesePizza();
        } else {
            pizza = new SHGreekPizza();
        }
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
