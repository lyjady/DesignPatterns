package org.augustus.design.decorator;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:26
 */
public class Seasoning extends Drink {

    protected Drink drink;

    public Seasoning(Drink drink) {
        this.drink = drink;
    }

    @Override
    public BigDecimal cost() {
        return this.price.add(this.drink.cost());
    }

}
