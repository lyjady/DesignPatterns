package org.augustus.design.command;

import org.augustus.design.command.receiver.Light;

/**
 * @author LinYongJin
 * @date 2020/7/21 10:41
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
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
