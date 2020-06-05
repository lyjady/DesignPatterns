package org.augustus.design.factory.entry;

/**
 * @author LinYongJin
 * @date 2020/6/5 11:35
 */
public class ApplePhone extends Phone {

    public ApplePhone() {
        this.name = "苹果";
    }

    @Override
    public void assemble() {
        System.out.println("组装" + name + "手机");
    }
}
