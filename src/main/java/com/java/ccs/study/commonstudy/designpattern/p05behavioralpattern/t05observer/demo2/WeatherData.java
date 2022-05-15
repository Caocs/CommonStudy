package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t05observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:06 2022/5/15
 */
public class WeatherData implements Subject {

    private Float temperature;
    private Float pressure;
    private Float humidity;

    /**
     * 观察者对象列表
     */
    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public Float getHumidity() {
        return humidity;
    }

    /**
     * 向各个观察者推送天气数据到网站
     */
    public void dataChange() {
        notifyObservers();
    }

    /**
     * 当天气数据发生变化时进行更新
     */
    public void setData(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (o != null && observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, pressure, humidity);
        }
    }

}
