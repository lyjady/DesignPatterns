package org.augustus.principle.substitution;

/**
 * @author LinYongJin
 * @date 2020/5/20 19:41
 */
public class SubstitutionMain {

    /**
     * 里式替换原则, 子类最好不要去重写父类的方法, 要么父类中要重写的方法是抽象方法, 或者将父类与子类共同去继承一个基础类
     * 将通用的方法与属性放到基础类中, 然后"子类"再依赖、聚合、组合"父类"进行调用
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        System.out.println(b.addAndSub(9, 10));
    }
}
