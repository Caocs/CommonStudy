package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t01singleton;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/5/3
 * 懒汉式(线程不安全)
 */
public class Singleton3 {
    /**
     * 构造器私有化，外部不能new。
     */
    private Singleton3() {

    }

    /**
     * 本类内部创建对象实例
     */
    private static Singleton3 singleton;

    /**
     * 对外暴露的静态方法
     */
    public static Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }


}
