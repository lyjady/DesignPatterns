package org.augustus.design.factory.method;

import org.augustus.design.factory.entry.Phone;
import org.augustus.design.factory.entry.SamsungPhone;

/**
 * @author LinYongJin
 * @date 2020/6/5 17:24
 */
public class SamsungPhoneFactory implements PhoneFactory{

    @Override
    public Phone production() {
        return new SamsungPhone();
    }
}
