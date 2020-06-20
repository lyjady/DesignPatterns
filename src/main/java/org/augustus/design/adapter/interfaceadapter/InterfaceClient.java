package org.augustus.design.adapter.interfaceadapter;

/**
 * @author LinYongJin
 * @date 2020/6/20 19:58
 */
public class InterfaceClient {

    public static void main(String[] args) {
        new AbstractClass() {
            @Override
            public void method1() {
                System.out.println("Override method1");
            }
        }.method1();
    }
}
