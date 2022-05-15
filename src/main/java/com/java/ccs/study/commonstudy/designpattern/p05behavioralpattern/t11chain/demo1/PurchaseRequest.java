package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t11chain.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:31 2022/5/15
 * 采购申请类
 */
public class PurchaseRequest {

    private Integer id;
    private Float price;

    public PurchaseRequest(Integer id, Float price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }
}
