package com.java.ccs.study.commonstudy.base.thread.demo06;

/**
 * @author caocs
 * @date 2021/11/14
 * <p>
 * 同步代码块：
 * 1、操作共享数据的代码，即为需要被同步的代码。
 * 2.共享数据：多个线程共同操作的变量。
 * 3.同步监视器，俗称锁。
 * 任何一个类的对象，都可以充当锁。  但是要求：多个线程必须要共用同一把锁。
 */
public class ThreadTest3 {

    public static void main(String[] args) {
        MyThread3 myThread = new MyThread3();
        Thread thread01 = new Thread(myThread, "1号");
        Thread thread02 = new Thread(myThread, "2号");
        Thread thread03 = new Thread(myThread, "3号");
        // 启动线程，调用当前线程的run()方法，这里面调用了Runnable类型的target的run()方法
        thread01.start();
        thread02.start();
        thread03.start();
    }

}

class MyThread3 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }
    // 同步方法
    private synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
            ticket--;
        }
    }
}
