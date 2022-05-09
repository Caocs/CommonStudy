package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t06flyweight.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:22 2022/5/9
 * 外部状态，非共享角色
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
