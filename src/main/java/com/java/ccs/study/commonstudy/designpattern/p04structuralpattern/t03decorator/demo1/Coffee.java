package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t03decorator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:43 2022/5/8
 */
public class Coffee extends Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }


}
