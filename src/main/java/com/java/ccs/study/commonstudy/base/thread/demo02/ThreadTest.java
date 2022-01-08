package com.java.ccs.study.commonstudy.base.thread.demo02;

import com.java.ccs.study.commonstudy.base.thread.demo01.MyThread;

/**
 * @author caocs
 * @date 2021/11/14
 * <p>
 * Thread类中常用方法：
 * 1.start() 启动当前线程，并调用当前线程的run()
 * 2.run()
 * 3.currentThread() 静态方法，返回当前代码的线程
 * 4.setName() 注：设置线程名相同并不会导致程序出错
 * 5.getName()
 * 6.yield() 释放当前线程执行权，重新竞争
 * 7.join() 在线程A中调用线程B的join()方法，
 * 此时线程A就进入阻塞方法，直到线程B完全执行完以后，
 * 线程A才会结束阻塞状态，直到竞争到资源后才会继续执行。
 * 8.stop() （不推荐使用，已过时）强制结束当前线程
 * 9.sleep(millis) 休眠。结束后等竞争到cpu资源才会继续执行
 * 10.isAlive() 判断当前线程是否存活
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread thread01 = new MyThread();
        thread01.setName("线程一：");
        MyThread thread02 = new MyThread("线程一：");
        thread01.start();
        thread02.start();

        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if (i == 20 ) {
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


