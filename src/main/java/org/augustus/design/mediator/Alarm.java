package org.augustus.design.mediator;

/**
 * @author LinYongJin
 * @date 2020/8/6 11:19
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public Mediator getMediator() {
        return super.getMediator();
    }

    public void SendAlarm(int stateChange) {
        sendMessage(stateChange);
    }


    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
