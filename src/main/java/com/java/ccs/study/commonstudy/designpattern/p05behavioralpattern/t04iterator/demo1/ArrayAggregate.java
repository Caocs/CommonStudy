package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t04iterator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:55 2022/5/12
 * <p>
 * 聚合接口：将客户端和具体的聚合解耦
 */
public class ArrayAggregate implements Aggregate {

    private Integer[] departments;
    private Integer position = 0;

    public ArrayAggregate() {
        this.departments = new Integer[15];
    }

    public void addItem(Integer item) {
        this.position = this.position + 1;
        departments[position] = item;
    }

    /**
     * 需要使用对应的Iterator迭代器。
     */
    @Override
    public Iterator<Integer> createIterator() {
        return new ArrayIterator(departments);
    }

}
