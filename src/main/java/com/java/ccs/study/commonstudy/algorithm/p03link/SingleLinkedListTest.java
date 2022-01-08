package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 单链表
 */
public class SingleLinkedListTest {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.show();
        singleLinkedList.addToRear(new SingleLinkedNode(1,"ccs1"));
        singleLinkedList.addToRear(new SingleLinkedNode(3,"ccs3"));
        singleLinkedList.show();

        boolean flag1 = singleLinkedList.addByNo(new SingleLinkedNode(3,"ccs3"));
        System.out.println(flag1);
        boolean flag2 = singleLinkedList.addByNo(new SingleLinkedNode(2,"ccs2"));
        System.out.println(flag2);
        singleLinkedList.show();

        boolean flag3 = singleLinkedList.updateByNo(2,"ccs2-new");
        System.out.println(flag3);
        singleLinkedList.show();

        boolean flag4 = singleLinkedList.deleteByNo(2);
        System.out.println(flag4);
        singleLinkedList.show();

        boolean flag5 = singleLinkedList.deleteByNo(3);
        System.out.println(flag5);
        singleLinkedList.show();

        boolean flag6 = singleLinkedList.deleteByNo(3);
        System.out.println(flag6);

        int count = singleLinkedList.size();
        System.out.println(count);
    }

}
