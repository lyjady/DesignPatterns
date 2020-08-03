package org.augustus.design.observer;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/8/3 16:45
 */
public class SinaSite implements Observer {

    private int temperature;

    private int humidity;

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        System.out.println("-------Sina-------");
        return new StringJoiner(", ", SinaSite.class.getSimpleName() + "[", "]")
                .add("temperature=" + temperature)
                .add("humidity=" + humidity)
                .toString();
    }
}
