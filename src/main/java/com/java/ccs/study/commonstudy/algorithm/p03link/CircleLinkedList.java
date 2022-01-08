package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/23
 * 单向环形链表，
 * 约瑟夫问题：
 * 有N个人围坐一圈，约定从某人k从1开始报数，数到m的人出列。
 * 然后继续下一个人从1开始报数，数到m的人出列。
 * 依次类推，由此产生的序列。
 */
public class CircleLinkedList {

    private SingleLinkedNode first;

    public CircleLinkedList() {

    }

    /**
     * @param num 向链表中插入num个节点，形成环形链表
     */
    public void addNode(int num) {
        if (num < 1) {
            throw new IllegalArgumentException("num < 1");
        }
        SingleLinkedNode cur = null;
        for (int index = 1; index <= num; index++) {
            SingleLinkedNode node = new SingleLinkedNode(index, null);
            if (index == 1) {
                // 第一个节点
                first = node;
                first.setNext(first);
                cur = first;
            } else {
                cur.setNext(node);
                node.setNext(first);
                cur = node;
            }
        }
    }

    public void show() {
        if (first == null) {
            System.out.println("empty");
        }
        SingleLinkedNode cur = first;
        while (true) {
            System.out.println(cur.getNo());
            if (cur.getNext() == first) {
                break;
            } else {
                cur = cur.getNext();
            }
        }
    }

    /**
     * 约瑟夫问题，打印出圈顺序
     *
     * @param startNo  表示从第几个小孩开始数数
     * @param countNum 表示数几下
     * @param nums     表示最初圈中小朋友个数
     */
    public void josefu(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            throw new IllegalArgumentException();
        }
        SingleLinkedNode cur = first;
        // 先让cur指针移动到first的前一个节点。（因为单链表删除某个节点，需要前一个节点的帮助）
        while (true) {
            if (cur.getNext() == first) {
                break;
            } else {
                cur = cur.getNext();
            }
        }
        // 找到从第startNo开始报数的前一个位置。因为下一个位置已经开始报数了。
        for (int index = 0; index < startNo - 1; index++) {
            first = first.getNext();
            cur = cur.getNext();
        }
        // 执行报数操作，让first和cur同时移动countNum次，然后出圈。（循环）
        while (true) {
            // 圈中只剩一个元素时，结束
            if (first == first.getNext()) {
                System.out.println(first.getNo());
                break;
            }
            // 向后移动countNum次，表示报数。
            for (int index = 0; index < countNum - 1; index++) {
                first = first.getNext();
                cur = cur.getNext();
            }
            // first节点出圈
            System.out.println(first.getNo());
            cur.setNext(first.getNext());
            first = first.getNext();
        }
    }

}
