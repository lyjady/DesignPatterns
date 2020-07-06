package org.augustus.design.facade;

/**
 * @author LinYongJin
 * @date 2020/7/6 16:25
 */
public class Facade {

    private Sound sound = Sound.getInstance();
    private Dvd dvd = Dvd.getInstance();
    private Tv tv = Tv.getInstance();

    public void setting() {
        sound.setting();
    }

    public void ready() {
        tv.ready();
    }

    public void on() {
        sound.on();
        dvd.on();
        tv.on();
    }

    public void off() {
        sound.off();
        dvd.off();
        tv.off();
    }
}
