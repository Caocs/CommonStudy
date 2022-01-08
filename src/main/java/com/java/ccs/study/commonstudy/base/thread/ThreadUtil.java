package com.java.ccs.study.commonstudy.base.thread;

/**
 * @author caocs
 * @date 2021/11/18
 */
public class ThreadUtil {

    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
