package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t10strategy.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:45 2022/5/15
 * // 高级会员类 20%折扣
 */
public class AdvanceMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price, int n) {
        double money = price * n - price * n * 0.2;
        return money;
    }
}

