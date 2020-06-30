package org.augustus.design.decorator;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:11
 */
public abstract class Drink {

    protected String description;

    protected BigDecimal price;

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract BigDecimal cost();

}
