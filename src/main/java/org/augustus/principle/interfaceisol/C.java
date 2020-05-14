package org.augustus.principle.interfaceisol;

/**
 * @author LinYongJin
 * @date 2020/5/14 22:39
 */
public class C {

    public void d1(InterfaceOne one) {
        one.methodOne();
    }

    public void d4(InterfaceThree one) {
        one.methodFour();
    }

    public void d5(InterfaceThree one) {
        one.methodFive();
    }
}
