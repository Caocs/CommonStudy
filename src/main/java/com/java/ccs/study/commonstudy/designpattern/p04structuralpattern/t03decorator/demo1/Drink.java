package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t03decorator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:52 2022/5/8
 */
public abstract class Drink {

    /**
     * 描述信息，用来表示饮料名称
     */
    private String description;
    private float price = 0.0f;

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
