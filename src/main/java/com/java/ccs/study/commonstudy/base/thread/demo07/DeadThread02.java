package com.java.ccs.study.commonstudy.base.thread.demo07;

/**
 * @author caocs
 * @date 2021/11/17
 */
public class DeadThread02 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        new Thread(new Runnable() {
            @Override
            public void run() {
                a.foo(b);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                b.bar(a);
            }
        }).start();
    }

}

class A{
    // 持有a对象的锁
    public synchronized void foo(B b){
        System.out.println("当前线程："+Thread.currentThread().getName()+" 进入A实例的foo方法");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程："+Thread.currentThread().getName()+" 企图调用B实例的last方法");
        b.last();
    }

    public synchronized void last(){
        System.out.println("进入A实例的last方法内部");
    }
}

class B{
    // 持有b对象的锁
    public synchronized void bar(A a){
        System.out.println("当前线程："+Thread.currentThread().getName()+" 进入B实例的bar方法");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程："+Thread.currentThread().getName()+" 企图调用A实例的last方法");
        a.last();
    }

    public synchronized void last(){
        System.out.println("进入B实例的last方法内部");
    }
}
