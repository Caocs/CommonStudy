package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t03decorator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:13 2022/5/9
 * 具体的装饰者，这里就是指调味品。
 */
public class MilkDecorator extends Decorator {


    public MilkDecorator(Drink drink) {
        super(drink);
        this.setDescription("Milk");
        this.setPrice(5.f);
    }

    
}
