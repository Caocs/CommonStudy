package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:45 2022/5/6
 * 抽象的建造者
 */
public abstract class HouseBuilder {
    /**
     * 需要组合一个House对象，返回出去
     */
    protected House house = new House();

    protected abstract void buildBasic();

    protected abstract void buildWall();

    protected abstract void buildRoof();


    public House build() {
        return house;
    }
}
