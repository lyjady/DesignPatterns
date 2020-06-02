package org.augustus.design.singleton;

/**
 * @author LinYongJin
 * @date 2020/6/2 11:02
 * 
 * 双重检查, 既保证了线程安全性又保证了效率, synchronized锁住的代码块只会执行一次即在第一次执行的时候
 */
public class Singleton4 {

    private static Singleton4 SINGLETON = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (SINGLETON == null) {
            synchronized (Singleton4.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton4();
                }
            }
        }
        return SINGLETON;
    }

    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
