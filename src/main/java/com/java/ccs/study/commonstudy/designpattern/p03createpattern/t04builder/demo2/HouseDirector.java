package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:42 2022/5/6
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * @return 把建造房子的流程，交给指挥者。
     */
    public House buildHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.build();
    }
}
