package com.java.ccs.study.commonstudy.algorithm.p03link;

/**
 * @author caocs
 * @date 2021/12/23
 */
public class CircleLinkedListTest {

    /**
     * 约瑟夫问题：
     * 有N个人围坐一圈，约定从某人k从1开始报数，数到m的人出列。
     * 然后继续下一个人从1开始报数，数到m的人出列。
     * 依次类推，由此产生的序列。
     */
    public static void main(String[] args) {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        // 围成一个圈
        circleLinkedList.addNode(10);
        // circleLinkedList.show();
        // 执行出圈操作
        circleLinkedList.josefu(1, 3, 10);
    }

}
