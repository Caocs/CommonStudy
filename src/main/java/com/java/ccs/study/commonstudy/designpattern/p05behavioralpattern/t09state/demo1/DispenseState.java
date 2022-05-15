package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t09state.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:49 2022/5/15
 * 发放奖品的状态
 */
public class DispenseState implements State  {
    private RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public Boolean reduceMoney() {
        System.out.println("已经进行过抽奖啦！");
        return false;
    }

    @Override
    public Boolean raffle() {
        System.out.println("已经进行过抽奖啦！");
        return false;
    }

    @Override
    public Boolean dispensePrize() {
        if (raffleActivity.getCount() <= 0) {
            raffleActivity.setDispenseOutState();
            System.out.println("今日奖品已领完，明天再来吧~");
            return false;
        }
        raffleActivity.setNoRaffleState();
        System.out.println("奖品领取成功~");
        return true;
    }
}
