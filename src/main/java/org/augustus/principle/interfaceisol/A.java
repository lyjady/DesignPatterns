package org.augustus.principle.interfaceisol;

/**
 * @author LinYongJin
 * @date 2020/5/14 22:39
 */
public class A {

    public void d1(InterfaceOne one) {
        one.methodOne();
    }

    public void d2(InterfaceTwo one) {
        one.methodTwo();
    }

    public void d3(InterfaceTwo one) {
        one.methodThree();
    }
}
