package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t03decorator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:00 2022/5/9
 * 装饰者(调味品装饰类)
 * （1）需要继承Drink，用来进行反复装饰。
 * （2）需要组合一个coffee实例，需要对该对象进行装饰。(被装饰者对象)
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 被装饰的饮料cost + 当前调料的价格
        return drink.cost() + super.getPrice();
    }

    @Override
    public String getDescription() {
        // drink.getDescription():如果是被装饰后的对象，会一直向上调用。
        return drink.getDescription() + " & " + super.getDescription();
    }
}
