package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo3;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:45 2022/5/11
 */
public class Main {

    /**
     * cglib动态代理，代理类
     */
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //通过代理工厂创建代理对象
        TeacherDao proxyInstance = (TeacherDao) new CglibProxyFactory(teacherDao).getProxyInstance();
        //通过代理对象调用目标对象方法
        String retVal = proxyInstance.teach();
        System.out.println("retVal=" + retVal);
    }

}
