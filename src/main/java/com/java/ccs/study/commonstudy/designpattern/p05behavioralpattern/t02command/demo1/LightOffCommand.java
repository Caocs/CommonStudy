package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t02command.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:01 2022/5/11
 */
public class LightOffCommand implements Command {
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
