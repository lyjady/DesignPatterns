package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:47
 */
public class GoodRunStrategy implements RunStrategy {
    @Override
    public void run() {
        System.out.println("跑得快");
    }
}
