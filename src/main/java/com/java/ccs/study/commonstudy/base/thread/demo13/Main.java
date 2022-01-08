package com.java.ccs.study.commonstudy.base.thread.demo13;

import java.util.concurrent.*;

/**
 * @author caocs
 * @date 2021/11/18
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        // execute()适用于Runnable方法
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("ha");
            }
        });
        // submit()适用于Callable方法
        Future<String> future = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        });
        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // 关闭连接池
        service.shutdown();
    }
}
