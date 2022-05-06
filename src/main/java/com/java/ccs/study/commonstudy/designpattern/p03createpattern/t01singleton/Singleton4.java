package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t01singleton;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/5/3
 */
public class Singleton4 {
    /**
     * 构造器私有化，外部不能new。
     */
    private Singleton4() {

    }

    /**
     * 本类内部创建对象实例
     * volatile解决指令重排序问题。
     */
    private static volatile Singleton4 singleton;

    /**
     * 对外暴露的静态方法
     * 通过synchronized同步代码块，解决线程安全
     * 但是效率太低
     */
    public static Singleton4 getInstance() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }


}
