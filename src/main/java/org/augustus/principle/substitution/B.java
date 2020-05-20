package org.augustus.principle.substitution;

/**
 * @author LinYongJin
 * @date 2020/5/20 19:25
 */
public class B extends Base {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public int addAndSub(int i, int j) {
        return a.add(i, j) - 9;
    }
}
