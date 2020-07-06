package org.augustus.design.facade;

/**
 * @author LinYongJin
 * @date 2020/7/6 16:21
 */
public class Dvd {

    private Dvd() {}

    private static final Dvd dvd = new Dvd();

    public static Dvd getInstance() {
        return dvd;
    }

    public void on() {
        System.out.println("DVD start");
    }

    public void off() {
        System.out.println("DVD off");
    }
}
