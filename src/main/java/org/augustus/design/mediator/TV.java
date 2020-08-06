package org.augustus.design.mediator;

/**
 * @author LinYongJin
 * @date 2020/8/6 11:09
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
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

    public void startTv() {
        System.out.println("It's time to StartTv!");
    }


    public void stopTv() {
        System.out.println("It's time to StartTv!");
    }

}
