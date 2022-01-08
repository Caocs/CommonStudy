package com.java.ccs.study.commonstudy.base.thread.demo11;

/**
 * @author caocs
 * @date 2021/11/18
 */
public class Product {

    private int count;

    public Product(int count) {
        this.count = count;
    }

    public void produce() {
        synchronized (this) {
            if (count < 20) {
                count++;
                System.out.println(Thread.currentThread().getName() + "正在生产第" + count + "产品");
                // 唤醒wait的线程（如果消费者被阻塞时，会被唤醒）
                notify();
            } else {
                try {
                    // 当生产超过20个，则执行wait阻塞当前线程（生产者线程）并且释放锁（产品对象）
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void consume() {
        synchronized (this) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + "正在消费第" + count + "产品");
                count--;
                // 唤醒wait的线程（如果生产者被阻塞时，会被唤醒）
                notify();
            } else {
                try {
                    // 当消费剩余个数小于0个，则执行wait阻塞当前线程（消费者线程）并且释放锁（产品对象）
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
