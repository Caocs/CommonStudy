package com.java.ccs.study.commonstudy.base.thread.demo01;

/**
 * @author caocs
 * @date 2021/11/14
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        /**
         * 1、是一个native方法
         * 2、启动当前线程，调用当前线程的run()方法
         * 3、只能start()一次。
         * 多次调用会因为threadStatus!=0抛出IllegalThreadStateException。
         */
        thread.start();


        // 匿名方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                }
            }
        }.start();

        System.out.println("main");
    }

}
