package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:45 2022/5/6
 */
public abstract class AbstractHouse {

    protected abstract void buildBasic();

    protected abstract void buildWall();

    protected abstract void buildRoof();

    /**
     * 缺点：将产品和创建产品的过程封装在一起，耦合性增强了。
     * 解决方法：
     * 将产品和产品建造过程解耦 -> 建造者模式。
     */
    public void build() {
        buildBasic();
        buildWall();
        buildRoof();
    }
}
