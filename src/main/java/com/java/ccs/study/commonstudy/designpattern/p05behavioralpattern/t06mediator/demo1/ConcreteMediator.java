package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:24 2022/5/15
 * 具体中介者：
 * 使用该中介者类，管理各个具体同事类。所以该类可能会很复杂。
 * 这样如果其他地方需要调用摸个具体同事类的时候，就只需要调用该中介类即可。
 */
public class ConcreteMediator extends Mediator {
    private Map<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
    }

    @Override
    public void registerColleague(Colleague colleague) {
        colleagueMap.put(colleague.getClass().getSimpleName(), colleague);
    }

    @Override
    public void getMsg(Integer state, String name) {
        Colleague colleague = colleagueMap.get(name);
        if (colleague instanceof Alarm) {
            dealAlarm(state);
        } else if (colleague instanceof CoffeeMachine) {
            dealCoffeeMachine(state);
        } else if (colleague instanceof Curtain) {
            dealCurtain(state);
        } else if (colleague instanceof TV) {
            dealTV(state);
        }
    }

    /**
     * 闹铃响起后操作
     */
    private void dealAlarm(Integer state) {
        if (Integer.valueOf(1).equals(state)) {
            ((Alarm) colleagueMap.get(Alarm.class.getSimpleName())).closeAlarm();
            ((CoffeeMachine) colleagueMap.get(CoffeeMachine.class.getSimpleName())).makeCoffee();
        }
    }

    /**
     * 咖啡机煮咖啡完毕后操作
     */
    private void dealCoffeeMachine(Integer state) {
        if (Integer.valueOf(1).equals(state)) {
            ((Curtain) colleagueMap.get(Curtain.class.getSimpleName())).downCurtain();
        }
    }

    /**
     * 窗帘落下后操作
     */
    private void dealCurtain(Integer state) {
        if (Integer.valueOf(0).equals(state)) {
            TV tv = (TV) colleagueMap.get(TV.class.getSimpleName());
            tv.openTV();
            tv.switchChannel(101);
        }
    }

    /**
     * 电视关闭后操作
     */
    private void dealTV(Integer state) {
        if (Integer.valueOf(0).equals(state)) {
            ((Curtain) colleagueMap.get(Curtain.class.getSimpleName())).upCurtain();
        }
    }

    @Override
    public void sendMsg() {
        // Do Nothing...
    }
}
