package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo2;

import com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.model.ITeacherDao;
import com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.model.TeacherDao;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:41 2022/5/9
 */
public class Main {

    /**
     * JDK动态代理，代理接口
     */
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        TeacherFactory teacherFactory = new TeacherFactory(teacherDao);
        ITeacherDao teacherDao1 = (ITeacherDao) teacherFactory.newProxyInstance(); // 根据接口，生成新的动态代理对象。
        teacherDao1.teach();

    }

}
