package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:48
 */
public class NoRunStrategy implements RunStrategy {
    @Override
    public void run() {
        System.out.println("不能跑");
    }
}
