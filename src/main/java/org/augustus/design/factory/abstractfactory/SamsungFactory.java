package org.augustus.design.factory.abstractfactory;

import org.augustus.design.factory.entry.AndroidHeadset;
import org.augustus.design.factory.entry.Headset;
import org.augustus.design.factory.entry.Phone;
import org.augustus.design.factory.entry.SamsungPhone;

/**
 * @author LinYongJin
 * @date 2020/6/10 11:30
 */
public class SamsungFactory implements IFactory{

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Headset createHeadset() {
        return new AndroidHeadset();
    }
}
