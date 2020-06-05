package org.augustus.design.factory.method;

import org.augustus.design.factory.entry.ApplePhone;
import org.augustus.design.factory.entry.Phone;

/**
 * @author LinYongJin
 * @date 2020/6/5 17:24
 */
public class ApplePhoneFactory extends PhoneFactory{

    @Override
    public Phone production() {
        return new ApplePhone();
    }
}
