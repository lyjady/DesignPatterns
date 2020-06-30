package org.augustus.design.decorator;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 16:51
 */
public class ChineseCoffee extends Coffee {

    public ChineseCoffee() {
        super.price = new BigDecimal("18.5");
        super.description = "中式咖啡";
    }
}
