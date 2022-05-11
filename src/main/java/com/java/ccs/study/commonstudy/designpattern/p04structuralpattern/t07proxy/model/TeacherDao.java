package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.model;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:32 2022/5/11
 * 被代理对象
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
