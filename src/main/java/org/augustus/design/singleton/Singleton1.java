package org.augustus.design.singleton;

/**
 * @author LinYongJin
 * @date 2020/6/2 9:23
 * 单例模式(饿汉式)
 * 之所以称之为饿汉式是因为在类被加载的时候这个对象的实例就被创建了, 也就是说这个类只要被使用这个对象就会被创建出来
 * 不管有没有永到这个对象, 如果没有没有到就会造成内存的浪费. 但是这样的写法是线程安全的, 因为一个类只会被加载初始化一次
 */
public class Singleton1 {

    private final static Singleton1 SINGLETON = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
