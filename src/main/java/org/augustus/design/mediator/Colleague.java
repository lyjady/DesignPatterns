package org.augustus.design.mediator;

/**
 * @author LinYongJin
 * @date 2020/8/6 10:50
 */
public abstract class Colleague {
    private Mediator mediator;

    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);

}
