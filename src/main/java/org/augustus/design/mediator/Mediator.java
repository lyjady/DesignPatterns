package org.augustus.design.mediator;

/**
 * @author LinYongJin
 * @date 2020/8/6 10:49
 */
public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
