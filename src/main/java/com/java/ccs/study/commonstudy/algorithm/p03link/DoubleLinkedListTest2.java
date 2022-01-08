package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 单链表
 */
public class DoubleLinkedListTest2 {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addToRear(new DoubleLinkedNode(1, "ccs1"));
        doubleLinkedList.addToRear(new DoubleLinkedNode(2, "ccs2"));
        doubleLinkedList.addToRear(new DoubleLinkedNode(3, "ccs3"));
        doubleLinkedList.addToRear(new DoubleLinkedNode(4, "ccs4"));
        doubleLinkedList.show();
        System.out.println("----");
        doubleLinkedList.reverse();
        doubleLinkedList.show();
        System.out.println("----");
        DoubleLinkedNode node = doubleLinkedList.getLastKNode(1);
        System.out.println(node);
    }



}
