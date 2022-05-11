package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo3;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:46 2022/5/11
 * 被代理对象
 */
public class TeacherDao {
    public String teach() {
        System.out.println("老师授课中...");
        return "Good";
    }
}
