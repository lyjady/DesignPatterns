package org.augustus.design.factory.abstractfactory;

import org.augustus.design.factory.entry.*;

/**
 * @author LinYongJin
 * @date 2020/6/10 11:29
 */
public class PhoneFactory implements IFactory{

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Headset createHeadset() {
        return new AppleHeadset();
    }
}
