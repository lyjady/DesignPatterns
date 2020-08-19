package org.augustus.design.responsibilitychain;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/8/19 9:26
 */
public class Client {
    public static void main(String[] args) {
        Approval departmentApproval = new DepartmentApproval("部长");
        Approval viceChancellorApproval = new ViceChancellorApproval("副校长");
        Approval chancellorApproval = new ChancellorApproval("校长");
        departmentApproval.setApproval(viceChancellorApproval);
        viceChancellorApproval.setApproval(chancellorApproval);
        chancellorApproval.setApproval(departmentApproval);
        Purchase purchase = new Purchase(new BigDecimal("9999"));
        viceChancellorApproval.approve(purchase);
    }
}
