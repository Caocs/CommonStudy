package com.java.ccs.study.commonstudy.algorithm.p02queue;

import java.util.Scanner;

/**
 * @author caocs
 * @date 2021/12/20
 */
public class CircleArrayQueueTest {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(5);
        Scanner scanner = new Scanner(System.in);
        String key = "";
        boolean loop = true;
        while (loop) {
            System.out.println("s:显示队列");
            System.out.println("e:退出程序");
            System.out.println("i:入队");
            System.out.println("o:出队");
            System.out.println("h:获取队列头数据");
            key = scanner.next();
            switch (key) {
                case "s":
                    queue.printQueue();
                    break;
                case "e":
                    loop = false;
                    break;
                case "i":
                    System.out.println("请输入一个数：");
                    int value = scanner.nextInt();
                    queue.inQueue(value);
                    break;
                case "o":
                    int out = queue.outQueue();
                    System.out.println(out);
                    break;
                case "h":
                    int head = queue.getHead();
                    System.out.println(head);
                    break;
                default:
                    break;
            }
        }

    }
}
