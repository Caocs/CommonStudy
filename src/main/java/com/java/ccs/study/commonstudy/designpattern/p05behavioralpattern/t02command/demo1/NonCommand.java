package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t02command.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:59 2022/5/11
 * 空命令，什么也不干
 * 对于简化操作有帮助，可以省去对空的判断。
 * 用于RemoteController中初始化Command。这样初始化时就创建了一个什么都不做的默认Command。然后后续需要执行某个指定Command时再重新覆盖即可。
 * -> 其实这也是一种设计模式，可以省略对空的判断。
 */
public class NonCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
