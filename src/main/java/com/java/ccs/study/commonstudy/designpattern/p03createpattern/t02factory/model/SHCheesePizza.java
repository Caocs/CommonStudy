package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t02factory.model;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:32 2022/5/5
 */
public class SHCheesePizza extends Pizza {

    @Override
    public void prepare() {
        this.setName("SH cheese");
        System.out.println("CheesePizza prepare");
    }


}
