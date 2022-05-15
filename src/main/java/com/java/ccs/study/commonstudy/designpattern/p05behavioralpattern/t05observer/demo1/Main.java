package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t05observer.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 15:16 2022/5/15
 */
public class Main {

    /**
     * 在天气WeatherData中更新数据，推送到各个第三方。
     * -> 如果新增一个第三方，都需要创建一个第三方公告板对象，并加入到dataChange()中。
     * 维护不方便，不是动态加入。
     * 问题分析：
     * 1）其他第三方接入气象站获取数据的问题
     * 2）无法在运行时动态的添加第三方（新浪网站）
     * 3）违反OCP原则 => 观察者模式
     */
    public static void main(String[] args) {
        // 创建气象网站对象
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建气象数据对象，并传入气象网站对象
        WeatherData weatherData = new WeatherData(currentConditions);
        // 天气发生变化时，更新最新的气象数据
        weatherData.setData(10f, 150f, 40f);
    }

}
