package com.java.ccs.study.commonstudy.base.thread.demo03;

import com.java.ccs.study.commonstudy.base.thread.demo01.MyThread;

/**
 * @author caocs
 * @date 2021/11/14
 * <p>
 * 线程优先级：
 * MIN_PRIORITY=1，MAX_PRIORITY=10，NORM_PRIORITY=5.
 * 从1-10，默认5.
 * <p>
 * 1.getPriority()
 * 2.setPriority(int)
 * <p>
 * 从概率上将，高优先级的线程更可能抢到资源执行。
 * 并不代表低优先级就无法抢到资源。
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread thread01 = new MyThread();
        thread01.setName("线程一：");
        System.out.println(thread01.getPriority());
        MyThread thread02 = new MyThread("线程二：");
        thread02.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread02.getPriority());
        thread01.start();
        thread02.start();

        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if (i == 20) {
                try {
                    // 主线程阻塞，直到thread02执行完成
                    thread02.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(thread02.isAlive());
    }
}


