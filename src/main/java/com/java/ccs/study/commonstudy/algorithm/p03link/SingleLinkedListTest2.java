package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 单链表
 */
public class SingleLinkedListTest2 {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addToRear(new SingleLinkedNode(1, "ccs1"));
        singleLinkedList.addToRear(new SingleLinkedNode(2, "ccs2"));
        singleLinkedList.addToRear(new SingleLinkedNode(3, "ccs3"));
        singleLinkedList.addToRear(new SingleLinkedNode(4, "ccs4"));
        singleLinkedList.show();
        System.out.println("----");
        singleLinkedList.reverse();
        singleLinkedList.show();
        System.out.println("----");
        SingleLinkedNode node = singleLinkedList.getLastKNode(1);
        System.out.println(node);
        System.out.println("----------");
        singleLinkedList.reverseShow();
    }



}
