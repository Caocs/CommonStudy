package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t05observer.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:03 2022/5/15
 */
public class Main {

    /**
     * 观察者模式：
     * 对象之间多对一依赖的一种设计方案，被依赖的对象为Subject，依赖的对象为Observer，Subject通知Observer变化，
     * 比如这里的奶站是Subject，是1的一方。用户是Observer，是多的一方
     * <p>
     * 设计:
     * 1）观察者模式设计后，会以集合的方式来管理用户Observer，包括注册、移除和通知
     * 2）这样，我们增加观察者（这里可以理解成一个新的公告板），就不需要去修改核心类WeatherData不会修改代码，遵守了ocp原则
     */
    public static void main(String[] args) {
        // 创建气象网站对象
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建气象数据对象
        WeatherData weatherData = new WeatherData();
        // 注册气象网站对象
        weatherData.registerObserver(currentConditions);
        // 天气发生变化时，更新最新的气象数据
        weatherData.setData(10f, 150f, 40f);

        System.out.println("新增SinaWebSite观察者");
        SinaWebSite sinaWebSite = new SinaWebSite();
        weatherData.registerObserver(sinaWebSite);
        weatherData.setData(10f, 160f, 40f);
    }

}
