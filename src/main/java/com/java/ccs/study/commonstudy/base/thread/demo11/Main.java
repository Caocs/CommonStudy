package com.java.ccs.study.commonstudy.base.thread.demo11;

/**
 * @author caocs
 * @date 2021/11/18
 */
public class Main {

    public static void main(String[] args) {
        Product product = new Product(0);
        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);
        new Thread(producer, "生产者1").start();
        new Thread(producer, "生产者2").start();
        new Thread(consumer, "消费者1").start();
    }

}
