package org.augustus.design.responsibilitychain;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/8/19 9:17
 */
public class DepartmentApproval extends Approval {

    public DepartmentApproval(String name) {
        super(name);
    }

    @Override
    public void approve(Purchase purchase) {
        if (purchase.getPrice().compareTo(new BigDecimal("50000")) <= 0) {
            System.out.println(name + "处理");
        } else {
            System.out.println(name + "无法处理");
            super.approval.approve(purchase);
        }
    }
}
