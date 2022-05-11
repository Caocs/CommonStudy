package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t07proxy.demo3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:47 2022/5/11
 */
public class CglibProxyFactory implements MethodInterceptor {

    /**
     * 目标对象
     */
    private Object target;

    /**
     * 构造函数
     */
    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回代理对象（其实是相当于继承被代理的类）
     */
    public Object getProxyInstance() {
        // 1、创建工具类
        Enhancer enhancer = new Enhancer();
        // 2、设置父类
        enhancer.setSuperclass(target.getClass());
        // 3、设置回调函数
        enhancer.setCallback(this);
        // 4、创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始...");
        Object retVal = method.invoke(target, objects);
        System.out.println("cglib代理结束...");
        return retVal;
    }


}
