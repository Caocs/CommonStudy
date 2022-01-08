package com.java.ccs.study.commonstudy.base.thread.demo09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author caocs
 * @date 2021/11/17
 * <p>
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000，每次存1000，存三次。每次存完打印账户余额。
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(0);
        Custom custom = new Custom(account);
        new Thread(custom, "储户1").start();
        new Thread(custom, "储户2").start();
    }

}


class Account {
    private int totalMoney;
    Lock lock = new ReentrantLock(true);

    public Account(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * 可能会有多个储户（线程）对totalMoney字段进行操作，存在线程安全问题
     */
    public void getMoney(int money) {
        try {
            lock.lock();
            this.totalMoney = this.totalMoney + money;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("从" + Thread.currentThread().getName() + "得到转账，此时共有" + this.totalMoney);
        } finally {
            lock.unlock();
        }
    }
}

class Custom implements Runnable {
    // 需要给转账的账户
    private Account account;

    public Custom(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.getMoney(100);
        }
    }
}