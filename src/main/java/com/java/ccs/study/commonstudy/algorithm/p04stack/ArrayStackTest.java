package com.java.ccs.study.commonstudy.algorithm.p04stack;

/**
 * @author caocs
 * @date 2021/12/23
 * 使用数组模拟栈
 */
public class ArrayStackTest {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int value = stack.pop();
        System.out.println(value);
        System.out.println("---");
        stack.list();
    }

}
