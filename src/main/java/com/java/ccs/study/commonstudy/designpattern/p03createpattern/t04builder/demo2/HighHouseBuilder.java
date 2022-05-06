package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:45 2022/5/6
 */
public class HighHouseBuilder extends HouseBuilder {

    @Override
    protected void buildBasic() {
        System.out.println("High buildBasic");
    }

    @Override
    protected void buildWall() {
        System.out.println("High buildWall");
    }

    @Override
    protected void buildRoof() {
        System.out.println("High buildWall");
    }
}
