package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t03prototype.model;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:58 2022/5/5
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;

    /**
     * @return 克隆该实例，使用默认的clone方法来完成
     */
    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
