package org.augustus.design.singleton;

/**
 * @author LinYongJin
 * @date 2020/6/2 9:44
 *
 * 单例模式(同步锁机制优化懒汉式)
 * 通过synchronized关键词给实例方法加锁, 这样可以避免线程安全问题, 但是存在严重的效率问题
 */
public class Singleton3 {

    private static Singleton3 SINGLETON = null;

    private Singleton3() {
    }

    public synchronized static Singleton3 getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Singleton3();
        }
        return SINGLETON;
    }

    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
