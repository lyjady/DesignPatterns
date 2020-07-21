package org.augustus.design.command;

/**
 * @author LinYongJin
 * @date 2020/7/21 10:41
 */
public interface Command {

    void execute();

    void undo();
}
