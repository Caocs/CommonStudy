package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t07memento.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:48 2022/5/15
 * 守护者对象（备忘录）
 */
public class Caretaker {

    /**
     * 存放会很多备忘录对象。
     */
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(Integer index) {
        return mementoList.get(index);
    }

}
