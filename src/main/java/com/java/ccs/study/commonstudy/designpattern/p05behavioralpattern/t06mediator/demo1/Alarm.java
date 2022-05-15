package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:21 2022/5/15
 * 闹钟（具体同事类）
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator) {
        super(mediator);
        this.getMediator().registerColleague(this);
    }

    /**
     * 闹铃响起
     */
    public void openAlarm() {
        System.out.println(">>>闹铃响起");
        try {
            //模拟闹铃耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendMsg(1);
    }

    /**
     * 闹铃关闭
     */
    public void closeAlarm() {
        System.out.println(">>>闹铃关闭");
        sendMsg(0);
    }
}
