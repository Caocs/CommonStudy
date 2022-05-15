package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t07memento.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:45 2022/5/15
 */
public class Main {

    /**
     * 备忘录模式：
     * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
     * <p>
     * 优点
     * 1）给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
     * 2）实现了信息的封装，使得用户不需要关心状态的保存细节
     * 缺点
     * 3）如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存，这个需要注意
     * 其他
     * 4）适用的应用场景：
     * 后悔药
     * 打游戏时的存档
     * Windows里的ctrl+z
     * IE中的后退
     * 数据库的事务管理
     * 5）为了节约内存，备忘录模式可以和原型模式配合使用
     */
    public static void main(String[] args) {
        Originator originator = new Originator(); // 原数据
        Caretaker caretaker = new Caretaker(); // 备忘录

        originator.setState("当前状态：" + " 状态#1 血量 100 ");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("当前状态：" + " 状态#2 血量 80 ");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("当前状态：" + " 状态#3 血量 60 ");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        // 恢复到状态1
        originator.revertStateFromMemento(caretaker.getMemento(0));
        System.out.println("恢复状态：" + originator.getState());
    }

}
