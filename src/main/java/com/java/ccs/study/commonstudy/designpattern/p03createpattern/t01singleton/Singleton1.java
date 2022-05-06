package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t01singleton;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/5/3
 * 饿汉式(静态变量)
 * -> 没有懒加载，可能在成
 */
public class Singleton1 {
    /**
     * 本类内部创建对象实例
     */
    private final static Singleton1 SINGLETON_1 = new Singleton1();

    /**
     * 构造器私有化，外部不能new。
     */
    private Singleton1() {

    }

    /**
     * 对外暴露的静态方法
     */
    public static Singleton1 getInstance() {
        return SINGLETON_1;
    }


}
