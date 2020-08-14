package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:41
 */
public class GoodFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("飞的很好");
    }
}
