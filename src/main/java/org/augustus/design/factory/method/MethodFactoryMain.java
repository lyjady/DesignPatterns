package org.augustus.design.factory.method;

import org.augustus.design.factory.entry.Phone;

/**
 * @author LinYongJin
 * @date 2020/6/5 17:25
 */
public class MethodFactoryMain {

    public static void main(String[] args) {
        ApplePhoneFactory applePhoneFactory = new ApplePhoneFactory();
        Phone apple = applePhoneFactory.production();
        SamsungPhoneFactory samsungPhoneFactory = new SamsungPhoneFactory();
        Phone samsung = samsungPhoneFactory.production();
        apple.prepare();
        apple.assemble();
        apple.massProduction();
        System.out.println("----------------");
        samsung.prepare();
        samsung.assemble();
        samsung.massProduction();
    }
}
