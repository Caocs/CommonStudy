package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t04iterator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:55 2022/5/12
 * <p>
 * 聚合接口：将客户端和具体的聚合解耦
 */
public class ListAggregate implements Aggregate {

    private List<Integer> departments;

    public ListAggregate() {
        this.departments = new ArrayList<>();
    }

    public void addItem(Integer item) {
        departments.add(item);
    }

    /**
     * 需要使用对应的Iterator迭代器。
     */
    @Override
    public Iterator<Integer> createIterator() {
        return new ListIterator(departments);
    }

}
