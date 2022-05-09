package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t04composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:39 2022/5/9
 * 该类是叶子结点，add/remove方法就不需要重写了。
 */
public class Department extends OrganizationComponent {

    List<OrganizationComponent> componentList = new ArrayList<>();


    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {
        System.out.println(this.getName());
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
