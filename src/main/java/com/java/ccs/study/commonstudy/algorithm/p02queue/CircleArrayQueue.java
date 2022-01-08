package com.java.ccs.study.commonstudy.algorithm.p02queue;

/**
 * @author caocs
 * @date 2021/12/20
 * 使用数组模拟环形队列
 * 1.front变量：指向队列的第一个元素
 * 初始值=0
 * 2.rear变量：指向队列的最后一个元素的后一个位置。因为希望空出来一个空间作为约定
 * 初始值=0
 * 3.队列满：(rear+1)%maxSize==front
 * 4.队列空：rear==front
 * 5.有效的数据个数：(rear+maxSize-front)%maxSize
 */
public class CircleArrayQueue {

    /**
     * 表示数组的最大容量
     */
    private int maxSize;
    /**
     * 指向队列的第一个元素
     * 初始值=0
     */
    private int front;
    /**
     * 指向队列的最后一个元素的后一个位置。因为希望空出来一个空间作为约定
     * 初始值=0
     */
    private int rear;
    /**
     * 用于存储数据，模拟队列
     */
    private int[] dataArray;

    public CircleArrayQueue(int maxSize) {
        if (maxSize < 1) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        dataArray = new int[maxSize];
        front = 0;
        rear = 0;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 入队
     */
    public void inQueue(int data) {
        if (this.isFull()) {
            throw new RuntimeException("queue is full");
        }
        // 因为rear本来就指向最后一个元素的下一个位置。
        dataArray[rear] = data;
        rear = (rear + 1) % maxSize; // rear指针后移，这里必须考虑取模
    }

    /**
     * 出队
     */
    public int outQueue() {
        if (this.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        int value = dataArray[front];
        front = (front + 1) % maxSize; // 指针后移
        return value;
    }

    /**
     * 获取队列头数据，并不从队列中取出
     */
    public int getHead() {
        if (this.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return dataArray[front];
    }

    public void printQueue() {
        if (this.isEmpty()) {
            System.out.println("queue is empty");
        }
        // 队列中有效的数据个数
        int validCount = (rear + maxSize - front) % maxSize;
        // 从front开始遍历，遍历validCount个元素。
        for (int i = front; i < front + validCount; i++) {
            int index = i % maxSize; // 所在下标，有可能超过数组长度到前面
            System.out.print(dataArray[index] + " ");
        }
        System.out.println();
    }

}
