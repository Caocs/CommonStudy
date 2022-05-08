package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t01adapter.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:10 2022/5/7
 */
public class Main {

    /**
     * 适配器模式，主要分为三类：
     * 类适配器模式、对象适配器模式、接口适配器模式。
     * 工作原理：
     * 将一个类的接口转换成另一个接口，让原本接口不兼容的类可以兼容。
     * 从用户的角度看不到被适配者，是解耦的。
     * 用户调用适配器转化出来的目标接口方法，适配器在调用被适配者的相关接口方法。
     * 用户收到反馈结果，感觉是和目标接口交互。
     * 使用案例：
     * 在SpringMVC框架中，HandlerAdapter。
     */
    public static void main(String[] args) {

    }

}
