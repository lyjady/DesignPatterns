package org.augustus.design.decorator;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:28
 */
public class Milk extends Seasoning {


    public Milk(Drink drink) {
        super(drink);
        super.description = "牛奶";
        super.price = new BigDecimal("1.5");
    }
}
