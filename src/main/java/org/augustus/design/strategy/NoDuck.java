package org.augustus.design.strategy;

/**
 * @author LinYongJin
 * @date 2020/8/14 14:41
 */
public class NoDuck extends Duck {

    public NoDuck(FlyStrategy flyStrategy, RunStrategy runStrategy) {
        super(flyStrategy, runStrategy);
    }

}
