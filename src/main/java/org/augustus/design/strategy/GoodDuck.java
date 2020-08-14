package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:42
 */
public class GoodDuck extends Duck {

    public GoodDuck(FlyStrategy flyStrategy, RunStrategy runStrategy) {
        super(flyStrategy, runStrategy);
    }
}
