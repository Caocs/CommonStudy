package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t04composite.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 1:30 2022/5/9
 */
public class Main {

    /**
     * 组合模式：
     * 又叫做部分整体模式，它创建对象组的树形结构，将对象组合成树状结构以表示"整体-部分"的层次关系。
     * 组合模式使得用户对单个对象和组合对象的访问具有一致性，
     * 即：组合能让客户以一致的方式处理个别对象以及组合对象。
     * -> 如果结点和叶子有很多差异性的话，不适合使用组合模式。
     */
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "顶级大学");
        OrganizationComponent college1 = new College("计算机学院", "哈哈");
        OrganizationComponent college2 = new College("信息学院", "嘻嘻");
        OrganizationComponent department1 = new Department("计算机", "计算机");
        OrganizationComponent department2 = new Department("软件工程", "软件工程");
        OrganizationComponent department3 = new Department("信息科学", "信息科学");
        OrganizationComponent department4 = new Department("物联网", "物联网");


        college1.add(department1);
        college1.add(department2);
        college2.add(department3);
        college2.add(department4);

        university.add(college1);
        university.add(college2);

        university.print();

    }

}
