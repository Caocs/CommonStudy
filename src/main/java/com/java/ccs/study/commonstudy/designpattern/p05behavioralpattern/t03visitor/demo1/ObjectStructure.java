package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t03visitor.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:59 2022/5/12
 */
public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person p) {
        personList.add(p);
    }

    public void detach(Person p) {
        personList.remove(p);
    }

    public void display(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }

}
