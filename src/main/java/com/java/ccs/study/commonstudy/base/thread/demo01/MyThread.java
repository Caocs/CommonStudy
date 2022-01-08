package com.java.ccs.study.commonstudy.base.thread.demo01;

/**
 * @author caocs
 * @date 2021/11/14
 * <p>
 * 多线程创建
 * 方式1：创建继承Thread类的子类
 * <p>
 * 例子：
 * 遍历100以内的所有偶数
 */
public class MyThread extends Thread {

    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if (i % 20 == 0) {
                // 重新去竞争资源
                Thread.yield();
            }
        }
    }

}
