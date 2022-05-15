package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t10strategy.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:44 2022/5/15
 * 普通会员——不打折
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price, int n) {
        return price * n;
    }
}

