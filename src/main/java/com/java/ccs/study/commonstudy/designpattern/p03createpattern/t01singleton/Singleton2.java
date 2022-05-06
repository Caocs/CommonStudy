package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t01singleton;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/5/3
 * 饿汉式(静态代码块)
 * -> 没有懒加载，可能造成懒加载
 */
public class Singleton2 {
    /**
     * 构造器私有化，外部不能new。
     */
    private Singleton2() {

    }

    /**
     * 本类内部创建对象实例
     */
    private final static Singleton2 singleton;

    static {
        // 在静态代码块中，创建单例对象。
        singleton = new Singleton2();
    }

    /**
     * 对外暴露的静态方法
     */
    public static Singleton2 getInstance() {
        return singleton;
    }


}
