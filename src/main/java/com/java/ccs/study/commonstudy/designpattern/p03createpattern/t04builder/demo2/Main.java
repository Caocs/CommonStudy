package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:06 2022/5/6
 */
public class Main {

    /**
     * 建造者模式：
     * 四个角色：
     * Product(产品):一个具体的产品对象
     * Builder(抽象建造者):创建一个Product对象的各个部件 的 指定的接口/抽象类
     * ConcreteBuilder(具体建造者)：实现接口，构建和装配各个部件。
     * Director(指挥者):构建一个使用Builder接口的对象。
     * 它主要是用于创建一个复杂的对象。
     * 它的主要作用有连两个，一是：隔离客户与对象的生产过程，二是：负责控制产品对象的生产过程。
     * <p>
     * -> 将产品本身与产品的创建过程解耦，使得使用不同的具体建造者，相同的创建过程可以创建出不同的产品对象。
     * -> 产品类型是同一个，创建步骤一致，但是每个小步可能会不同。
     * <p>
     * Java中建造者模式的应用：
     * StringBuilder,StringBuffer类。
     */
    public static void main(String[] args) {
        HouseBuilder builder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(builder);
        House house = houseDirector.buildHouse();


        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
    }
}
