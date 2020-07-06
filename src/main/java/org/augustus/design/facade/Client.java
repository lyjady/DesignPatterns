package org.augustus.design.facade;

/**
 * @author LinYongJin
 * @date 2020/7/6 16:30
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.setting();
        System.out.println("-------------");
        facade.ready();
        System.out.println("-------------");
        facade.on();
        System.out.println("-------------");
        facade.off();
    }
}
