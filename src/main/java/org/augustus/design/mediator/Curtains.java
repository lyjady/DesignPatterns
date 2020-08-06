package org.augustus.design.mediator;

/**
 * @author LinYongJin
 * @date 2020/8/6 11:07
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public Mediator getMediator() {
        return super.getMediator();
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void upCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
