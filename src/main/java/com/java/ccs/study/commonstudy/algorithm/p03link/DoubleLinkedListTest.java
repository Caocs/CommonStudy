package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 单链表
 */
public class DoubleLinkedListTest {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.show();
        doubleLinkedList.addToRear(new DoubleLinkedNode(1,"ccs1"));
        doubleLinkedList.addToRear(new DoubleLinkedNode(3,"ccs3"));
        doubleLinkedList.show();

        boolean flag1 = doubleLinkedList.addByNo(new DoubleLinkedNode(3,"ccs3"));
        System.out.println(flag1);
        boolean flag2 = doubleLinkedList.addByNo(new DoubleLinkedNode(2,"ccs2"));
        System.out.println(flag2);
        doubleLinkedList.show();

        boolean flag3 = doubleLinkedList.updateByNo(2,"ccs2-new");
        System.out.println(flag3);
        doubleLinkedList.show();

        boolean flag4 = doubleLinkedList.deleteByNo(2);
        System.out.println(flag4);
        doubleLinkedList.show();

        boolean flag5 = doubleLinkedList.deleteByNo(3);
        System.out.println(flag5);
        doubleLinkedList.show();

        boolean flag6 = doubleLinkedList.deleteByNo(3);
        System.out.println(flag6);

        int count = doubleLinkedList.size();
        System.out.println(count);
    }

}
