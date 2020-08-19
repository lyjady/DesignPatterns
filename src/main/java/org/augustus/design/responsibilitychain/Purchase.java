package org.augustus.design.responsibilitychain;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/8/19 9:17
 */
public class Purchase {

    private BigDecimal price;

    public Purchase(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Purchase setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
