package org.augustus.design.facade;

/**
 * @author LinYongJin
 * @date 2020/7/6 16:25
 */
public class Sound {
    private Sound() {}

    private static final Sound Sound = new Sound();

    public static Sound getInstance() {
        return Sound;
    }

    public void setting() {
        System.out.println("Sound setting");
    }

    public void on() {
        System.out.println("Sound start");
    }

    public void off() {
        System.out.println("Sound off");
    }
}
