package com.java.ccs.study.commonstudy.base.thread.demo07;

/**
 * @author caocs
 * @date 2021/11/17
 * <p>
 * 演示死锁
 * 不同的线程，分别占用对方需要的同步资源不放。都在等待对方释放自己需要的同步资源。形成死锁。
 */
public class DeadThread {

    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (builder1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (builder2) {
                        builder1.append("a");
                        builder2.append("1");
                        System.out.println(builder1);
                        System.out.println(builder2);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (builder2) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (builder1) {
                        builder2.append("1");
                        builder1.append("a");
                        System.out.println(builder1);
                        System.out.println(builder2);
                    }
                }
            }
        }).start();


    }

}
