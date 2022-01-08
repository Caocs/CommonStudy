package com.java.ccs.study.commonstudy.algorithm.p04stack;

/**
 * @author caocs
 * @date 2021/12/23
 * 使用数组模拟栈
 */
public class ArrayStack {

    private int maxSize; // 栈的大小
    private int[] stack; // 使用数组模拟栈
    private int top = -1; // 栈顶指针

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (this.isFull()) {
            System.out.println("full");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("empty");
        }
        int value = stack[top];
        top--;
        return value;
    }

    public int peek(){
        return stack[top];
    }

    public void list() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[top--]);
        }
    }

}
