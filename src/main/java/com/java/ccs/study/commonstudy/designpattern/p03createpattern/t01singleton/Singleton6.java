package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t01singleton;

/**
 * @Author: Cao.cs
 * @Date: Created in 16:51 2022/5/3
 */
public class Singleton6 {
    public static void main(String[] args) {

        /**
         * 借助IDK1.5中添加的枚举来实现单例模式，不仅能够避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
         * 推荐使用
         */
        Singleton.INSTANCE.sayOk();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}
