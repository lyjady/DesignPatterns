package org.augustus.design.observer;

/**
 * @author LinYongJin
 * @date 2020/8/3 16:46
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new WeatherData();
        Observer sina = new SinaSite();
        subject.register(sina);
        subject.setData(20, 10);
        System.out.println("====================");
        Observer google = new GoogleSite();
        subject.register(google);
        subject.setData(25, 15);
    }
}
