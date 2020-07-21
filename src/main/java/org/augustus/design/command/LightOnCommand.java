package org.augustus.design.command;

import org.augustus.design.command.receiver.Light;

/**
 * @author LinYongJin
 * @date 2020/7/21 10:41
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
