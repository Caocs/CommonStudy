package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t01template.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:07 2022/5/11
 */
public class PeanutSoybeanMilk extends AbstractSoybeanMilk {
    public PeanutSoybeanMilk() {
        System.out.println("============花生豆浆============");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Step2. 加入上好的花生.");
    }
}
