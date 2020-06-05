package org.augustus.design.factory.entry;

/**
 * @author LinYongJin
 * @date 2020/6/5 11:37
 */
public class SamsungPhone extends Phone{

    public SamsungPhone() {
        this.name = "三星";
    }

    @Override
    public void assemble() {
        System.out.println("组装" + name + "手机");
    }
}
