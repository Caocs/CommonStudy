package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model.Pizza;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:32 2022/5/5
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("greek");
        System.out.println("GreekPizza prepare");
    }


}
