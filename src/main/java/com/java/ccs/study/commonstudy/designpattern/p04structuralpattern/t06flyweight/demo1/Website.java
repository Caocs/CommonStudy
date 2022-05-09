package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t06flyweight.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:20 2022/5/9
 * 抽象的享元角色，是抽象的产品类，同时定义出对象的外部状态和内部状态的接口和实现
 */
public abstract class Website {
    enum Type {
        新闻,
        博客,
        微信公众号
    }

    public abstract void use(User user);

}
