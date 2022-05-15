package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:23 2022/5/15
 * 窗帘（具体同事类）
 */
public class Curtain extends Colleague {
    public Curtain(Mediator mediator) {
        super(mediator);
        this.getMediator().registerColleague(this);
    }

    /**
     * 拉起窗帘
     */
    public void upCurtain() {
        System.out.println(">>>拉起窗帘...");
        sendMsg(1);
        try {
            //模拟拉起窗帘耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 拉下窗帘
     */
    public void downCurtain() {
        System.out.println(">>>拉下窗帘...");
        sendMsg(0);
        try {
            //模拟拉下窗帘耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
