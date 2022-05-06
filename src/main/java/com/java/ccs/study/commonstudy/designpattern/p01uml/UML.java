package com.java.ccs.study.commonstudy.designpattern.p01uml;

/**
 * @Author: Cao.cs
 * @Date: Created in 0:48 2022/5/3
 */
public class UML {

    /**
     * (1)UML：统一建模语言
     * (2)类之间的关系(6种)：
     * 1.依赖：
     * 只要是在类中用到了对方，那么他们之间就存在依赖关系。
     * 2.泛化(继承)：
     * 泛化关系实际上就是继承关系，它是依赖关系的特例。
     * 3.实现：
     * 实现关系实际上就是A类实现B接口，它是依赖关系的特例。
     * 4.关联：
     * 关联关系实际上就是类与类之间的联系，它是依赖关系的特例。
     * 关联具有导航性：即双向关系或单向关系。
     * 关系具有多重性：如"有且仅有一个"，"0个或多个"，"0个或1个"，"n到m个都可以"
     * 5.聚合：
     * 聚合关系表示整体和部分的关系，整体与部分可以分开。
     * 聚合关系时关联关系的特例。所以他具有关联关系的导航性和多重性。
     * 6.组合：
     * 组合关系表示整体和部分的关系，整体与部分不可以分开。
     * 组合关系时关联关系的特例。所以他具有关联关系的导航性和多重性。
     * <p>
     * 例如：
     * public class Person {
     * private IdCard card; -> 这个IdCard类和Person类是聚合关系。(可以分开)
     * private Head head = new Head(); -> 这个Head类和Person类是组合关系。(不可分开)
     * }
     * 但是如果在程序中Person实体类中定义了对IdCard进行级联删除，即删除Person时连同IdCard一起删除，那么IdCard和Person就是组合关系了。
     * 总结：还是得看整体和部分是否可分。整体不存在则部分也没有存在必要->组合。
     */
    public static void main(String[] args) {

    }
}
