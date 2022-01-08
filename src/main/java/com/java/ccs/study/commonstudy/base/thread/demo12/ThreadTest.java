package com.java.ccs.study.commonstudy.base.thread.demo12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author caocs
 * @date 2021/11/18
 * <p>
 * 使用Callable创建线程
 */
public class ThreadTest {

    public static void main(String[] args) {
        NumCallable numCallable = new NumCallable();
        // 将次Callable接口实现类的对象传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask<String> futureTask = new FutureTask<>(numCallable);
        // 必须放入线程中，并start，才会真正执行。
        new Thread(futureTask).start();

        try {
            // 阻塞的获取结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 通过实现Callable接口创建线程。
 * 可以使用泛型，可以返回数据。根据泛型得到返回数据类型
 * 可以抛出异常
 * 使用FutureTask
 */
class NumCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return String.valueOf(sum);
    }
}