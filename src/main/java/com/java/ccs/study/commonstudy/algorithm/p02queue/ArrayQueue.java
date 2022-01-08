package com.java.ccs.study.commonstudy.algorithm.p02queue;

/**
 * @author caocs
 * @date 2021/12/20
 * 使用数组模拟队列
 * (1)目前数组使用一次就不能用了，没有达到复用的效果
 * (2)将这个数组使用算法，可以改进成一个环形的队列。（取模）
 */
public class ArrayQueue {

    private int maxSize;// 表示数组的最大容量
    private int front; // 队列头
    private int rear; // 队列尾
    private int[] dataArray; // 用于存储数据，模拟队列

    public ArrayQueue(int maxSize) {
        if (maxSize < 1) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        dataArray = new int[maxSize];
        front = -1; // 指向队列头部（第一个元素的前一个位置）
        rear = -1; // 指向队列尾。初始时为-1
    }

    public boolean isFull() {
        return rear == maxSize - 1;
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
        rear++;
        dataArray[rear] = data;
    }

    /**
     * 出队
     */
    public int outQueue() {
        if (this.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        front++;
        return dataArray[front];
    }

    /**
     * 获取队列头数据，并不从队列中取出
     */
    public int getHead() {
        if (this.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        int temp = front + 1;
        return dataArray[temp];
    }

    public void printQueue() {
        if (this.isEmpty()) {
            System.out.println("queue is empty");
        }
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();
    }

}
