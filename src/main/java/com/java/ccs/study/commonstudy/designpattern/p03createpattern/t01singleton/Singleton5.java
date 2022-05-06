package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t01singleton;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/5/3
 * 延迟加载，效率高，线程安全。
 * 推荐使用
 */
public class Singleton5 {
    /**
     * 构造器私有化，外部不能new。
     */
    private Singleton5() {

    }

    /**
     * 静态内部类方式，在Singleton5类被装载时并不会立即实例化，在调用getInstance方法才会装载SingletonInstance类。
     * 利用类加载机制来保证初始化实例时，只有一个线程。 -> 线程安全
     */
    private static class SingletonInstance {
        private static final Singleton5 INSTANCE = new Singleton5();
    }


    public static Singleton5 getInstance() {
        return SingletonInstance.INSTANCE;
    }


}
