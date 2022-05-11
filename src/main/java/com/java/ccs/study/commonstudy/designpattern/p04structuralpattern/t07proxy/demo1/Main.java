package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo1;

import com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.model.TeacherDao;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:41 2022/5/9
 */
public class Main {

    /**
     * 代理模式：
     * 为一个对象提供一个替身，以控制对这个对象的访问。即通过代理对象访问目标对象。
     * 这样的好处是：可以在目标对象实现的基础上，增强额外的功能操作，即扩展目标对象的功能。
     * -> 静态代理、动态代理（JDK代理、Cglib代理）。
     * JDK代理接口，Cglib代理类。
     */
    public static void main(String[] args) {
        // 测试静态代理
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，聚合被代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用被代理对象的方法
        teacherDaoProxy.teach();

    }

}
