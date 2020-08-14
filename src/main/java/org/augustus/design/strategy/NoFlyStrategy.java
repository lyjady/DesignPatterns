package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:39
 */
public class NoFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}
