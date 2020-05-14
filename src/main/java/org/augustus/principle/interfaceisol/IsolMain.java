package org.augustus.principle.interfaceisol;

/**
 * @author LinYongJin
 * @date 2020/5/14 22:44
 */
public class IsolMain {

    /**
     * 接口隔离原则, 将接口中的方法根据实际情况进行拆封.
     * @param args
     */
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        a.d1(new B());
        a.d2(new B());
        a.d3(new B());
        c.d1(new D());
        c.d4(new D());
        c.d5(new D());
    }
}
