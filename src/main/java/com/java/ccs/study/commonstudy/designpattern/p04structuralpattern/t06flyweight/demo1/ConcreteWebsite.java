package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t06flyweight.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:21 2022/5/9
 * 具体的享元角色
 */
public class ConcreteWebsite  extends Website{

    private Type type;

    public ConcreteWebsite(Type type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站正在使用中：类型为" + type.name() + "，使用者为" + user.getName());
    }
}
