package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t09state.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:40 2022/5/15
 * 定义当前状态
 */
public class RaffleActivity {

    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);

    /**
     * 当前状态，是会随着活动进行而变化的。
     */
    private State state = null;
    /**
     * 奖品数量
     */
    private int count = 0;


    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣钱
     */
    public void deductMoney() {
        state.reduceMoney();
    }

    /**
     * 抽奖
     */
    public void raffle() {
        // 判断当前状态下，能否去领奖品
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return 这里表示：每领取一次奖品，count--
     */
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setNoRaffleState() {
        this.state = noRaffleState;
    }

    public void setCanRaffleState() {
        this.state = canRaffleState;
    }

    public void setDispenseState() {
        this.state = dispenseState;
    }

    public void setDispenseOutState() {
        this.state = dispenseOutState;
    }
}
