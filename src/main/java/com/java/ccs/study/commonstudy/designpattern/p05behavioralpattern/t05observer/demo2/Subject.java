package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t05observer.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:06 2022/5/15
 * 主体对象接口(被观察者)
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
