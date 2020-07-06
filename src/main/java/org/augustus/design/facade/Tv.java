package org.augustus.design.facade;

/**
 * @author LinYongJin
 * @date 2020/7/6 16:23
 */
public class Tv {

    private Tv() {}

    private static final Tv Tv = new Tv();

    public static Tv getInstance() {
        return Tv;
    }

    public void ready() {
        System.out.println("Tv ready");
    }

    public void on() {
        System.out.println("Tv start");
    }

    public void off() {
        System.out.println("Tv off");
    }
}
