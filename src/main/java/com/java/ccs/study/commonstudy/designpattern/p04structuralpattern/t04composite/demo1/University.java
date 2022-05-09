package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t04composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:39 2022/5/9
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> componentList = new ArrayList<>();


    public University(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {
        System.out.println("-----" + this.getName() + "------");
        for (OrganizationComponent component : componentList) {
            component.print();
        }
    }

    /**
     * 重写父类方法
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        componentList.add(organizationComponent);
    }

    /**
     * 重写父类方法
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        componentList.remove(organizationComponent);
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
