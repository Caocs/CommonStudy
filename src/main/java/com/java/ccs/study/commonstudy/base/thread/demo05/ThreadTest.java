package com.java.ccs.study.commonstudy.base.thread.demo05;

/**
 * @author caocs
 * @date 2021/11/14
 * <p>
 * 存在线程安全问题
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread01 = new Thread(myThread, "1号");
        Thread thread02 = new Thread(myThread, "2号");
        // 启动线程，调用当前线程的run()方法，这里面调用了Runnable类型的target的run()方法
        thread01.start();
        thread02.start();
    }

}

class MyThread implements Runnable {
    // 这里没有使用static。也存在线程安全问题
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
