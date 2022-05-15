package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t09state.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 21:14 2022/5/15
 */
public class Main {

    /**
     * 状态模式：
     * 它主要用来解决对象在多种状态转换时，需要对外输出不同的行为的问题。状态和行为是一一对应的，状态之间可以相互转换。
     * 当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类。
     * <p>
     * APP 抽奖活动具体要求如下：
     * 1）假如每参加一次这个活动要扣除用户 50 积分，中奖概率是 10%
     * 2）奖品数量固定，抽完就不能抽奖
     * 3）活动有四个状态：可以抽奖、不能抽奖、发放奖品和奖品领完。
     * <p>
     * 角色与职责：
     * Context环境角色：维护一个State实例，这个实例定义了当前状态
     * State抽象状态角色：定义一个接口，封装与Context的一个特点接口相关行为
     * ConcreteState具体状态角色：实现一个与Context的一个状态相关行为
     * <p>
     * 优点
     * 1）代码有很强的可读性：状态模式将每个状态的行为封装到对应的一个类中
     * 2）方便维护：将容易产生问题的if-else语句删除了，如果把每个状态的行为都放到一个类中，每次调用方法时都要判断当前是什么状态，不但会产出很多if-else语句，而且容易出错
     * 3）符合开闭原则，容易增删状态
     * 缺点
     * 4）会产生很多类：每个状态都要一个对应的类，当状态过多时会产生很多类，加大维护难度
     * 应用场景
     * 5）当一个事件或者对象有很多种状态，状态之间会相互转换，对不同的状态要求有不同的行为时，可以考虑使用状态模式
     */
    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(2);
        // 第一次抽奖
        System.out.println("======第一次抽奖======");
        raffleActivity.deductMoney();
        raffleActivity.raffle();
        // 第二次抽奖
        System.out.println("======第二次抽奖======");
        raffleActivity.deductMoney();
        raffleActivity.raffle();
        // 第三次抽奖
        System.out.println("======第三次抽奖======");
        raffleActivity.deductMoney();
        raffleActivity.raffle();
    }

}
