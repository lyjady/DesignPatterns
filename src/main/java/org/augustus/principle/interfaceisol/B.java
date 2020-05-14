package org.augustus.principle.interfaceisol;

/**
 * @author LinYongJin
 * @date 2020/5/14 22:39
 */
public class B implements InterfaceOne, InterfaceTwo{

    @Override
    public void methodOne() {
        System.out.println("B.methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("B.methodTwo");
    }

    @Override
    public void methodThree() {
        System.out.println("B.methodThree");
    }
}
