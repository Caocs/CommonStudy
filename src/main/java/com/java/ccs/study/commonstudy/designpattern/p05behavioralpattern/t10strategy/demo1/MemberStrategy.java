package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t10strategy.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:43 2022/5/15
 */
public interface MemberStrategy {


    /**
     * 一个计算价格的抽象方法
     *
     * @param price 商品的价格
     * @param n     n商品的个数
     */
    double calcPrice(double price, int n);

}
