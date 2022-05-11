package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo1;

import com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.model.ITeacherDao;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:32 2022/5/11
 * 代理对象，
 * 代理对象与目标对象要实现相同的接口，然后通过调用相同的方法来调用目标对象的方法
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("准备授课...");
        iTeacherDao.teach();
        System.out.println("结束授课...");
    }
}
