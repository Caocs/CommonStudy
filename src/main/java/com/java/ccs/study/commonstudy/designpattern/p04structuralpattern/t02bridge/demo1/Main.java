package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t02bridge.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:39 2022/5/8
 */
public class Main {

    /**
     * 桥接模式
     * 将实现与抽象放在两个不同的类层次中，使两个层次可以独立改变。
     * 桥接模式基于类的最小设计原则，通过使用封装、聚合及继承等行为让不同的类承担不同的职责。
     * 它的主要特点是把抽象与行为实现分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展。
     * 做法：
     * 手机品牌(小米、oppo)，手机品类(折叠屏、全面屏)等，每个品类都有各个品牌的手机。
     * -> 如果根据品牌和品类不同分别定义不同的类时，新增品类或品牌时，会导致类爆炸。
     * 抽象类：定义手机品牌抽象类，
     * 行为实现的接口：来电，开机，关机等功能
     * -> 这样新增品牌或者品类时，只需要再新增一个对应的实现类即可。不必笛卡尔积式类扩张。
     * <p>
     * 场景举例：
     * JDBC中的DriverManager类。
     * Driver接口，如果从桥接模式来看，Driver就是一个接口，Mysql的Driver，Oracle的Driver，都是其实现接口类。
     * Mysql有机子的ConnectionImpl类，Oracle也有对应的实现类。
     * Driver和Connection之间通过DriverManager类进行桥接。
     * <p>
     * 注意：
     * (1)桥接模式替代多层继承方案，可以减少子类的个数，降低系统的管理和维护成本。
     * (2)桥接模式要求正确识别出系统中两个独立变化的维度，因此在使用范围有一定的局限性，即需要有这样的应用场景。
     */
    public static void main(String[] args) {
        // 各个手机品牌的功能接口
        Brand brand = new XiaoMi();
        // 手机品类（通过组合方式，引入Brand）
        Phone phone = new FoldedPhone(brand);
        phone.call();
    }

}
