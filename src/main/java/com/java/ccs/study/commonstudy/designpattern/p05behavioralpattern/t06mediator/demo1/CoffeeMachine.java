package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:22 2022/5/15
 *  咖啡机（具体同事类）
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator) {
        super(mediator);
        this.getMediator().registerColleague(this);
    }

    /**
     * 煮咖啡
     */
    public void makeCoffee() {
        System.out.println(">>>煮咖啡中...");
        sendMsg(0);
        try {
            //模拟煮咖啡耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 煮咖啡完毕
     */
    public void completeCoffee() {
        System.out.println(">>>咖啡已煮好");
        sendMsg(1);
    }
}
