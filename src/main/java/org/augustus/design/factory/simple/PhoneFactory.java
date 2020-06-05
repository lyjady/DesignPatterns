package org.augustus.design.factory.simple;

import com.sun.org.apache.xpath.internal.objects.XNull;
import org.augustus.design.factory.entry.ApplePhone;
import org.augustus.design.factory.entry.Phone;
import org.augustus.design.factory.entry.SamsungPhone;

/**
 * @author LinYongJin
 * @date 2020/6/5 11:38
 */
public class PhoneFactory {

    private static volatile PhoneFactory FACTORY = null;

    private PhoneFactory() {
    }

    public static PhoneFactory getInstance() {
        if (FACTORY == null) {
            synchronized (PhoneFactory.class) {
                if (FACTORY == null) {
                    FACTORY = new PhoneFactory();
                }
            }
        }
        return FACTORY;
    }

    public Phone production(String name) {
        if ("Apple".equals(name)) {
            return new ApplePhone();
        } else if ("Samsung".equals(name)) {
            return new SamsungPhone();
        } else {
            return null;
        }
    }
}
