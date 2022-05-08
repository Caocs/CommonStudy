package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t03decorator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:39 2022/5/8
 */
public class Main {

    /**
     * 装饰器模式：
     * 动态的将新功能附加到对象上。
     * 在对象功能扩展方面，它比继承更有弹性，装饰器模式也体现开闭原则。
     * <p>
     * 场景举例：
     * 在Java的IO中，
     * FilterInputStream算是装饰者，InputStream是被装饰者。
     * BufferedInputStream,DataInputStream算是具体装饰者(FilterInputStream的子类)
     */
    public static void main(String[] args) {
        // 使用装饰器模式点单：黑铁咖啡+牛奶+2份巧克力
        Coffee blackTeaCoffee = new BlackTeaCoffee(30f);
        Decorator milk = new MilkDecorator(blackTeaCoffee);
        Decorator chocolate1 = new ChocolateDecorator(milk);
        Decorator chocolate2 = new ChocolateDecorator(chocolate1);
        float cost = chocolate2.cost();
        String description = chocolate2.getDescription();
        System.out.println("花费：" + cost);
        System.out.println("描述：" + description);

        // 一个错误的使用
        Decorator decorator1 = new Decorator(blackTeaCoffee);
        Decorator decorator2 = new Decorator(decorator1);
        float cost1 = decorator2.cost();
        String description1 = decorator2.getDescription();
        System.out.println("花费：" + cost1);
        System.out.println("描述：" + description1);
    }

}
