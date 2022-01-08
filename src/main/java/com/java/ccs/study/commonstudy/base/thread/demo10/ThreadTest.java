package com.java.ccs.study.commonstudy.base.thread.demo10;

import com.java.ccs.study.commonstudy.base.thread.ThreadUtil;

/**
 * @author caocs
 * @date 2021/11/18
 * <p>
 * 线程通信：使用两个线程交替打印1-100.
 * <p>
 * 使用synchronized的 wait+notify、notifyAll方法实现线程通信。
 */
public class ThreadTest {

    public static void main(String[] args) {
        NumberPrint numberPrint = new NumberPrint();
        new Thread(numberPrint, "线程1").start();
        new Thread(numberPrint, "线程2").start();
    }
}

/**
 * 多个线程同时操作number，存在线程安全问题。
 * -> 使用synchronized
 * 为了使多个线程交替访问，
 * -> 使用wait+notify/notifyAll，进行线程间通信
 *
 * 注意：这三个方法的调用者都必须是同步监视器。
 */
class NumberPrint implements Runnable {

    private int number = 1;

    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                // 唤醒一个被wait的线程。
                obj.notify();
                ThreadUtil.sleep(10);
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        // 当前线程进入阻塞状态。并且释放锁。
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
