package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t02command.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:00 2022/5/11
 * 调用者
 */
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    /**
     * 指定执行的被调用者。
     */
    private Command restoreCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            // 初始化为NonCommand。这样在其他地方就可以省掉对该对象空的判断。
            onCommands[i] = new NonCommand();
            offCommands[i] = new NonCommand();
        }
    }

    public void setCommands(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onBtnCommand(int no) {
        restoreCommand = onCommands[no];
        restoreCommand.execute();
    }

    public void offBtnCommand(int no) {
        restoreCommand = offCommands[no];
        restoreCommand.execute();
    }

    public void undoBtnCommand() {
        restoreCommand.undo();
    }
}
