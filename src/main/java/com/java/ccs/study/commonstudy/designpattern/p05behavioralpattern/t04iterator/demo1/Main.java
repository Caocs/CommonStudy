package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t04iterator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:18 2022/5/12
 */
public class Main {

    /**
     * 迭代器模式：
     * 提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层表示，即：不暴露其内部结构。
     * 如果我们的集合元素时用不同的方式实现的，有数组，还有Java集合类或其他方式，
     * 当客户端要遍历这些集合元素的时候，就要使用多种遍历方式，而且还会暴露元素的内部结构，可以考虑使用迭代器模式。
     */
    public static void main(String[] args) {
        // 每个聚合对象，都要一个对应的迭代器。
        ArrayAggregate arrayAggregate = new ArrayAggregate();
        arrayAggregate.addItem(1);
        arrayAggregate.addItem(2);
        arrayAggregate.addItem(3);
        arrayAggregate.addItem(4);
        arrayAggregate.addItem(5);
        Iterator<Integer> iterator = arrayAggregate.createIterator();
        while (iterator.hasNext()) {
            Integer item = (Integer) iterator.next();
            System.out.println("============" + item + "============");
        }

        ListAggregate listAggregate = new ListAggregate();
        listAggregate.addItem(6);
        listAggregate.addItem(7);
        listAggregate.addItem(8);
        listAggregate.addItem(9);
        listAggregate.addItem(10);
        Iterator<Integer> iterator2 = listAggregate.createIterator();
        while (iterator2.hasNext()) {
            Integer item = (Integer) iterator2.next();
            System.out.println("============" + item + "============");
        }

    }

}
