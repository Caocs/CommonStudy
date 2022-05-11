package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t01template.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:53 2022/5/11
 */
public class Main {

    /**
     * 模板方法模式：
     * 在一个抽象类中公开定义了执行它的方法的模板。它的子类可以按需要重谢方法实现，但是调用将以抽象类中定义的方式进行。
     * 简单说，模板方法模式定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构，就可以重定义该算法的某些特定步骤。
     * 钩子方法：
     * 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事，子类可以视情况要不要覆盖它，该方法称为“钩子”
     * 案例分析：
     * Spring框架中，AbstractApplicationContext.java中有一个refresh()方法就是模板方法，其中定义了抽象方法和钩子方法
     * 好处：
     * 实现最大化代码复用
     */
    public static void main(String[] args) {
        AbstractSoybeanMilk peanutSoybeanMilk = new PeanutSoybeanMilk();
        peanutSoybeanMilk.templateMake();

        AbstractSoybeanMilk redSoybeanMilk = new RedSoybeanMilk();
        redSoybeanMilk.templateMake();

        AbstractSoybeanMilk sesameSoybeanMilk = new SesameSoybeanMilk();
        sesameSoybeanMilk.templateMake();
    }

}
