package org.augustus.design.decorator;


import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:21
 */
public class AmericanCoffee extends Coffee {

    public AmericanCoffee() {
        super.description = "美式咖啡";
        super.price = new BigDecimal("10.5");
    }

}
