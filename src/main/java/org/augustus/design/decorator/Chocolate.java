package org.augustus.design.decorator;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:31
 */
public class Chocolate extends Seasoning {

    public Chocolate(Drink drink) {
        super(drink);
        super.description = "巧克力";
        super.price = new BigDecimal("2.5");
    }
}
