package org.augustus.principle.interfaceisol;

/**
 * @author LinYongJin
 * @date 2020/5/14 22:39
 */
public class D implements InterfaceOne, InterfaceThree{

    @Override
    public void methodOne() {
        System.out.println("D.methodOne");
    }

    @Override
    public void methodFour() {
        System.out.println("D.methodFour");
    }

    @Override
    public void methodFive() {
        System.out.println("D.methodFive");
    }
}
