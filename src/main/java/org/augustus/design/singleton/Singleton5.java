package org.augustus.design.singleton;

/**
 * @author LinYongJin
 * @date 2020/6/2 15:31
 *
 * 单例模式(静态内部类)
 * 采用静态内部类的特性, 当使用到外部类的时候静态内部类不会被加载. 只用使用到静态内部类的时候才会去加载这个内部类这个就保证了懒加载
 * 在JVM加载类的时候是线程安全的, 这就保证了这个单例的写法在程序中是线程安全的
 */
public class Singleton5 {

    private Singleton5() {
    }

    public static class StaticSingleton {
        private static final StaticSingleton STATIC_SINGLETON = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return StaticSingleton.STATIC_SINGLETON;
    }

    public static void main(String[] args) {
        Singleton5.StaticSingleton instance1 = Singleton5.getInstance();
        Singleton5.StaticSingleton instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
