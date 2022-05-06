package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo2;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:45 2022/5/6
 */
public class CommonHouseBuilder extends HouseBuilder {


    @Override
    protected void buildBasic() {
        System.out.println("Common buildBasic");
    }

    @Override
    protected void buildWall() {
        System.out.println("Common buildWall");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Common buildWall");
    }
}
