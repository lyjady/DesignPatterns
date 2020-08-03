package org.augustus.design.observer;

/**
 * @author LinYongJin
 * @date 2020/8/3 16:37
 */
public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyOb();

    void setData(int temperature, int humidity);
}
