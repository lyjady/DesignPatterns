package org.augustus.design.command.invoker;

import org.augustus.design.command.Command;
import org.augustus.design.command.NoCommand;

/**
 * @author LinYongJin
 * @date 2020/7/21 10:47
 */
public class Remote {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public Remote() {
        onCommands = new Command[10];
        offCommands = new Command[10];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButton(int index) {
        onCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void offButton(int index) {
        offCommands[index].execute();
        undoCommand = onCommands[index];
    }

    public void undoButton() {
        undoCommand.execute();
    }
}
