package org.augustus.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/8/3 16:39
 */
public class WeatherData implements Subject {

    private int temperature;

    private int humidity;

    List<Observer> observers = new ArrayList<>();

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyOb();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOb() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity);
        }
    }
}
