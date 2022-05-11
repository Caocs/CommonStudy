package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t01template.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:07 2022/5/11
 */
public class RedSoybeanMilk extends AbstractSoybeanMilk {
    public RedSoybeanMilk() {
        System.out.println("============红豆豆浆============");
    }
    @Override
    protected void addIngredients() {
        System.out.println("Step2. 加入上好的红豆.");
    }
}
