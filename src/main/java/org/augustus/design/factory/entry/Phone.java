package org.augustus.design.factory.entry;

/**
 * @author LinYongJin
 * @date 2020/6/5 11:31
 */
public abstract class Phone {

    protected String name;

    public void prepare() {
        System.out.println("为" + name + "手机准备材料");
    }

    public abstract void assemble();

    public void massProduction() {
        System.out.println("量产" + name + "手机");
    }
}
