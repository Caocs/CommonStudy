package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/22
 * 单链表的节点
 */
public class SingleLinkedNode {

    private int no;
    private String name;
    private SingleLinkedNode next;

    public SingleLinkedNode(int no, String name) {
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

    public SingleLinkedNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleLinkedNode{" +
                "no=" + no +
                ", name=" + name +
                '}';
    }
}
