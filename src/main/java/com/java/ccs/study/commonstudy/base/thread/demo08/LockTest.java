package com.java.ccs.study.commonstudy.base.thread.demo08;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author caocs
 * @date 2021/11/17
 * <p>
 * 解决线程安全问题，方式2.
 * 使用Lock锁方式。 JDK5.0新增
 * <p>
 * 1.synchronized 和 lock 的异同
 * 同：二者都可以解决线程安全问题
 * 不同：Synchronized机制在执行完同步代码之后，自动释放同步监视器。
 * lock需要手动加锁，手动释放锁
 */
public class LockTest {

    public static void main(String[] args) {
        WindowThread window = new WindowThread();
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}


class WindowThread implements Runnable {
    private int ticket = 100;
    // 实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }

        }
    }
}

