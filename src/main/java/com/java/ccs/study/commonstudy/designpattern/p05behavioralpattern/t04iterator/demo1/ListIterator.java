package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t04iterator.demo1;

import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:51 2022/5/12
 * 具体迭代器类，内部使用List存放数据。
 */
public class ListIterator implements Iterator {

    private List<Integer> departments;
    private Integer position = -1;

    public ListIterator(List<Integer> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position + 1 < departments.size();
    }

    @Override
    public Object next() {
        return departments.get(++position);
    }
}
