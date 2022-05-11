package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:36 2022/5/11
 */
public class TeacherFactory {

    /**
     * 目标对象
     */
    private Object target;

    public TeacherFactory(Object target) {
        this.target = target;
    }

    public Object newProxyInstance() {
        /**
         * 1）ClassLoader loader：指定当前目标对象使用的类加载器，获取加载器的方法固定
         * 2）Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
         * 3）InvocationHandler h：事情处理，执行目标对象的方法时触发事情处理器方法，把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理授课开始...");
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理授课结束...");
                        return returnVal;
                    }
                });
    }

}
