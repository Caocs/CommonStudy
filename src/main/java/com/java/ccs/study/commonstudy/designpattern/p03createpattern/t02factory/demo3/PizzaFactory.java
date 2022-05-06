package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.demo3;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;
import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.PizzaType;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:37 2022/5/5
 */
public abstract class PizzaFactory {

    public abstract Pizza createPizza(PizzaType pizzaType);

}
