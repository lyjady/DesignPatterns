package org.augustus.design.responsibilitychain;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/8/19 9:18
 */
public class ViceChancellorApproval extends Approval {

    public ViceChancellorApproval(String name) {
        super(name);
    }

    @Override
    public void approve(Purchase purchase) {
        BigDecimal price = purchase.getPrice();
        if (price.compareTo(new BigDecimal("5000")) > 0 && price.compareTo(new BigDecimal("10000")) <= 0) {
            System.out.println(name + "处理");
        } else {
            System.out.println(name + "无法处理");
            super.approval.approve(purchase);
        }
    }
}
