package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t04composite.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:35 2022/5/9
 */
public abstract class OrganizationComponent {

    private String name;
    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected abstract void print();

    /**
     * 默认实现
     */
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 默认实现
     */
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
