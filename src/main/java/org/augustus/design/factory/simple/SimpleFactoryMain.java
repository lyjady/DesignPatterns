package org.augustus.design.factory.simple;

import org.augustus.design.factory.entry.ApplePhone;
import org.augustus.design.factory.entry.Phone;

/**
 * @author LinYongJin
 * @date 2020/6/5 11:45
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        PhoneFactory factory = PhoneFactory.getInstance();
        Phone apple = factory.production("Apple");
        apple.prepare();
        apple.assemble();
        apple.massProduction();
        System.out.println("----------------");
        Phone samsung = factory.production("Samsung");
        samsung.prepare();
        samsung.assemble();
        samsung.massProduction();
    }
}
