package com.java.ccs.study.commonstudy.designpattern.p03createpattern.t04builder.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:45 2022/5/6
 */
public  class CommonHouse extends AbstractHouse {


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
