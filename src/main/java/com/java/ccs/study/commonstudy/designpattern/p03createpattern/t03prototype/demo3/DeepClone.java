package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.demo3;

import java.io.Serializable;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:14 2022/5/6
 */
public class DeepClone implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepClone(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 该类中的成员变量都是String类型，通过默认的clone方法即可完成克隆。(浅拷贝)
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
