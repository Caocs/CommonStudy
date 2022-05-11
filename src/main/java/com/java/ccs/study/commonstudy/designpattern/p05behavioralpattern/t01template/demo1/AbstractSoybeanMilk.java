package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t01template.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:04 2022/5/11
 * 抽象方法，
 */
public abstract class AbstractSoybeanMilk {

    /**
     * 模板方法，定义为final禁止重写
     */
    public final void templateMake() {
        System.out.println(">>>>>>豆浆制作开始<<<<<<");
        useSoyBean();
        addIngredients();
        soak();
        mash();
        System.out.println(">>>>>>豆浆制作结束<<<<<<");
    }

    protected void useSoyBean() {
        System.out.println("Step1. 选用上好的黄豆.");
    }

    protected abstract void addIngredients();

    protected void soak() {
        System.out.println("Step3. 对黄豆和配料进行水洗浸泡.");
    }

    protected void mash() {
        System.out.println("Step4. 将充分浸泡过的黄豆和配料放入豆浆机中，开始打豆浆.");
    }

}
