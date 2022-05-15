package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t09state.demo1;

import java.util.Random;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:33 2022/5/15
 * 可以抽奖的状态
 */
public class CanRaffleState implements State {
    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public Boolean reduceMoney() {
        System.out.println("已扣除50积分，可以进行抽奖啦~");
        return false;
    }

    @Override
    public Boolean raffle() {
        if (new Random().nextInt(10) == 0) {
            raffleActivity.setDispenseState();
            System.out.println("恭喜您，中奖了~");
            return true;
        }
        raffleActivity.setNoRaffleState();
        System.out.println("很遗憾，您没有中奖~");
        return false;
    }

    @Override
    public Boolean dispensePrize() {
        System.out.println("尚未进行抽奖，无法领取奖品！");
        return false;
    }
}
