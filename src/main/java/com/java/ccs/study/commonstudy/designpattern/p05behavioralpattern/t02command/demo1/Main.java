package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t02command.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:43 2022/5/11
 */
public class Main {

    /**
     * 命令模式：
     * 使得请求发送者和请求接收者消除彼此之间的耦合，让对象之间的调用关系更加灵活，实现解耦。
     * 在命令模式中，会将一个请求封装为一个对象，以便使用不同参数来表示不同的请求(即命令)，同时命令模式也支持可撤销的操作。
     * 角色：
     * 调用者：Invoker
     * 被调用者：Receiver
     * 命令：MyCommand，实现Command接口，持有Receiver对象。
     * <p>
     * 案例说明：
     * Spring 框架 JdbcTemplate 中，
     * 以JdbcTemplate类中query()方法中为例，我们可以发现其中定义了一个内部类QueryStatementCallback，
     * 而且QueryStatementCallback类实现了StatementCallback接口的doInStatement方法
     * <p>
     * 命令模式的注意事项和细节
     * 1）将发起请求的对象与执行请求的对象解耦。发起请求的对象是调用者，调用者只要调用命令对象的execute()方法就可以让接收者工作，而不必知道具体的接收者对象是谁、是如何实现的，命令对象会负责让接收者执行请求的动作，也就是说：“请求发起者”和“请求执行者”之间的解耦是通过命令对象实现的，命令对象起到了纽带桥梁的作用
     * 2）容易设计一个命令队列。只要把命令对象放到列队，就可以多线程的执行命令
     * 3）容易实现对请求的撤销和重做
     * 4）不足：可能导致某些系统有过多的具体命令类，增加了系统的复杂度，这点在使用的时候要注意
     * 5）空命令也是一种设计模式，它为我们省去了判空的操作。在上面的实例中，如果没有用空命令，我们每按下一个按键都要判空，这给我们编码带来一定的麻烦
     * 6）命令模式经典的应用场景：界面的一个按钮对应一条命令、模拟 CMD（DOS命令）订单的撤销/恢复、触发-反馈机制
     */
    public static void main(String[] args) {
        // 初始化遥控器
        RemoteController remoteController = new RemoteController();
        // 操作电灯
        int no = 0;
        LightReceiver light = new LightReceiver();
        remoteController.setCommands(no, new LightOnCommand(light), new LightOffCommand(light));
        remoteController.onBtnCommand(no);
        remoteController.offBtnCommand(no);
        remoteController.undoBtnCommand();
        // 操作电视
        no = 1;
        TVReceiver tv = new TVReceiver();
        remoteController.setCommands(no, new TVOnCommand(tv), new TVOffCommand(tv));
        remoteController.onBtnCommand(no);
        remoteController.offBtnCommand(no);
        remoteController.undoBtnCommand();

        /**
         * remoteController执行Command指令，
         * 这样就和具体的Receiver解耦了。
         * 并且提供统一的方式，执行具体的Receiver中的方法。
         */
    }

}
