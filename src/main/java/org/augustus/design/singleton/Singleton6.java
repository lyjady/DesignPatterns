package org.augustus.design.singleton;

/**
 * @author LinYongJin
 * @date 2020/6/2 15:53
 *
 * 单例模式(枚举)
 * 这种写法不仅能避免多线程问题还能防止反序列化创建对象
 */
public enum  Singleton6 {
    INSTANCE;

    public void opr() {
        System.out.println("Singleton6.opr");
    }

    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.INSTANCE;
        Singleton6 instance2 = Singleton6.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.opr();
        System.out.println(instance1);
    }
}
