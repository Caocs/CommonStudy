package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t02command.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:01 2022/5/11
 */
public class TVOnCommand implements Command {
    private TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
