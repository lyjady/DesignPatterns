package org.augustus.design.factory.abstractfactory;

import org.augustus.design.factory.entry.Headset;
import org.augustus.design.factory.entry.Phone;

/**
 * @author LinYongJin
 * @date 2020/6/10 11:31
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone apple = phoneFactory.createPhone();
        apple.prepare();
        Headset appleHeadset = phoneFactory.createHeadset();
        appleHeadset.create();
        System.out.println("--------------");
        new SamsungFactory().createPhone().prepare();
        new SamsungFactory().createHeadset().create();
    }
}
