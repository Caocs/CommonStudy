package com.java.ccs.study.commonstudy.base.thread.demo04;

/**
 * @author caocs
 * @date 2021/11/14
 * <p>
 * 三个窗口卖票，一共100个票。
 * 存在线程安全问题。
 */
public class ThreadTest {

    public static void main(String[] args) {
        WindowThread window01 = new WindowThread("窗口1");
        WindowThread window02 = new WindowThread("窗口2");
        WindowThread window03 = new WindowThread("窗口3");

        window01.start();
        window02.start();
        window03.start();

    }
}


