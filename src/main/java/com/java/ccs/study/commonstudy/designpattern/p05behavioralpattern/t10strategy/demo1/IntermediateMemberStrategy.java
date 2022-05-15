package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t10strategy.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:44 2022/5/15
 * 中级会员 打百分之10的折扣
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price, int n) {
        double money = (price * n) - price * n * 0.1;
        return money;
    }
}


