package org.augustus.design.singleton;

/**
 * @author LinYongJin
 * @date 2020/6/2 9:30
 *
 * 单例模式(懒汉式)
 * 懒汉式相对于饿汉式他是在调用实例化方法时去判断对象是否被实例化, 若有则直接返回, 若没有则创建返回
 * 这样的做法是在使用到这对象是才去创建, 不使用则不创建. 避免了不必要的内存创建, 但是这样的写法存在线程安全问题, 在多线程的情况下可能会产生多实例
 */
public class Singleton2 {

    private static Singleton2 SINGLETON = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (SINGLETON == null) {
           SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
