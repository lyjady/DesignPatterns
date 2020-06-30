package org.augustus.design.decorator;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:15
 */
public class Coffee extends Drink {

    @Override
    public BigDecimal cost() {
        return this.price;
    }
}
