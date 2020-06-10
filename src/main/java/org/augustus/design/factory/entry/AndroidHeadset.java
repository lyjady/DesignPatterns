package org.augustus.design.factory.entry;

/**
 * @author LinYongJin
 * @date 2020/6/10 11:12
 */
public class AndroidHeadset extends Headset{

    @Override
    public void create() {
        System.out.println("安卓耳机");
    }
}
