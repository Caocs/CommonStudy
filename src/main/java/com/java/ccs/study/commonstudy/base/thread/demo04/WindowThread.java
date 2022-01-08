package com.java.ccs.study.commonstudy.base.thread.demo04;

/**
 * @author caocs
 * @date 2021/11/14
 */
public class WindowThread extends Thread {
    private static int ticket = 100;

    public WindowThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + ":买票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
