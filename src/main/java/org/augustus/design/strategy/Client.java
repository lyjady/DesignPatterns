package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:42
 */
public class Client {
    public static void main(String[] args) {
        Duck noDuck = new NoDuck(new NoFlyStrategy(), new NoRunStrategy());
        Duck goodDuck = new GoodDuck(new GoodFlyStrategy(), new GoodRunStrategy());
        Duck badDuck = new BadDuck(new BadFlyStrategy(), new BadRunStrategy());
        noDuck.fly();
        noDuck.run();
        System.out.println("------------");
        goodDuck.fly();
        goodDuck.run();
        System.out.println("------------");
        badDuck.fly();
        badDuck.run();
    }
}
