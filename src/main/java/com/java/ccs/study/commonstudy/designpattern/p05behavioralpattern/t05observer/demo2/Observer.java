package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t05observer.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:05 2022/5/15
 * 观察者接口
 */
public interface Observer {

    void update(Float temperature, Float pressure, Float humidity);

}
