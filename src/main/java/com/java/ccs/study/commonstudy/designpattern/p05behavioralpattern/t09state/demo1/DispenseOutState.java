package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t09state.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:49 2022/5/15
 * 奖品领完的状态
 */
public class DispenseOutState implements State  {
    private RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public Boolean reduceMoney() {
        System.out.println("今日奖品已领完，明天再来吧~");
        return false;
    }

    @Override
    public Boolean raffle() {
        System.out.println("今日奖品已领完，明天再来吧~");
        return false;
    }

    @Override
    public Boolean dispensePrize() {
        System.out.println("今日奖品已领完，明天再来吧~");
        return false;
    }
}
