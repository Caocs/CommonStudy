package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t04iterator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:51 2022/5/12
 *
 * 具体迭代器类，内部使用数组存放数据。
 */
public class ArrayIterator implements Iterator {
    private Integer[] departments;
    private Integer position = 0;

    public ArrayIterator(Integer[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position + 1 < departments.length && departments[position + 1] != null;
    }

    @Override
    public Object next() {
        return departments[++position];
    }

}
