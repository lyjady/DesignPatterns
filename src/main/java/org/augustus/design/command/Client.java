package org.augustus.design.command;

import org.augustus.design.command.invoker.Remote;
import org.augustus.design.command.receiver.Light;

/**
 * @author LinYongJin
 * @date 2020/7/21 11:01
 */
public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        Remote remote = new Remote();
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.onButton(0);
        remote.offButton(0);
        remote.undoButton();
    }
}
