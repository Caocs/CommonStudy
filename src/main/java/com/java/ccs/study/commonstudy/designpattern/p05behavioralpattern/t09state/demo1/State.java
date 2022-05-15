package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t09state.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:31 2022/5/15
 * 抽象状态角色
 */
public interface State {
    Boolean reduceMoney();

    Boolean raffle();

    Boolean dispensePrize();
}
