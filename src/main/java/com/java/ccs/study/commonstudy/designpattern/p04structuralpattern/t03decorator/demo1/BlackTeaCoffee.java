package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t03decorator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:56 2022/5/8
 */
public class BlackTeaCoffee extends Coffee {
    /**
     * 黑铁Coffee，在实例化的时候就应该完成标注价格。
     */
    public BlackTeaCoffee(float price) {
        this.setDescription("BlackTeaCoffee");
        this.setPrice(price);
    }

}
