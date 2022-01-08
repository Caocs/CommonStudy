package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 双向链表的节点
 */
public class DoubleLinkedNode {

    private int no;
    private String name;
    private DoubleLinkedNode next;
    private DoubleLinkedNode pre;

    public DoubleLinkedNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }

    public DoubleLinkedNode getPre() {
        return pre;
    }

    public void setPre(DoubleLinkedNode pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "DoubleLinkedNode{" +
                "no=" + no +
                ", name=" + name +
                '}';
    }
}
