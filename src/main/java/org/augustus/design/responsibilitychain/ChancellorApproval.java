package org.augustus.design.responsibilitychain;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/8/19 9:21
 */
public class ChancellorApproval extends Approval {

    public ChancellorApproval(String name) {
        super(name);
    }

    @Override
    public void approve(Purchase purchase) {
        BigDecimal price = purchase.getPrice();
        if (price.compareTo(new BigDecimal("10000")) > 0) {
            System.out.println(name + "处理");
        } else {
            System.out.println(name + "无法处理");
            super.approval.approve(purchase);
        }
    }
}
