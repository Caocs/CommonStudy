package com.java.ccs.study.commonstudy.base.thread.demo11;

import com.java.ccs.study.commonstudy.base.thread.ThreadUtil;

/**
 * @author caocs
 * @date 2021/11/18
 */
public class Consumer implements Runnable {

    private Product product;
    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            ThreadUtil.sleep(10);
            product.consume();
        }
    }
}
