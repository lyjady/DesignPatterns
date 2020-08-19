package org.augustus.design.responsibilitychain;

/**
 * @author LinYongJin
 * @date 2020/8/19 9:14
 */
public abstract class Approval {

    protected Approval approval;

    protected String name;

    public Approval(String name) {
        this.name = name;
    }

    protected Approval setApproval(Approval approval) {
        this.approval = approval;
        return this;
    }

    public abstract void approve(Purchase purchase);
}
