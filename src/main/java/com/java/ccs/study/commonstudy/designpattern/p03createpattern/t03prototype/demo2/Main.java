package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.demo2;

import com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.model.Sheep;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:56 2022/5/5
 */
public class Main {

    /**
     * 原型模式：
     * 原型类，声明一个clone自己的接口。
     *
     * 例子：
     * Spring中原型Bean(多例)的创建，就是原型模式的应用。 -> doGetBean
     */
    public static void main(String[] args) {
        Sheep sheep = new Sheep("a", 1, "red");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
    }
}
