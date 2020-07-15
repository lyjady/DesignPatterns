package org.augustus.design.template;

/**
 * @author LinYongJin
 * @date 2020/7/15 10:51
 */
public abstract class AbstractRestaurant {

    protected String name;

    protected int step = 1;

    public AbstractRestaurant(String name) {
        this.name = name;
    }

    private void enter() {
        System.out.println(step + ".进入" + name);
        step++;
    }

    private void search() {
        System.out.println(step + ".寻找位置");
        step++;
    }

    public abstract void order();

    private void eat() {
        System.out.println(step + ".就餐");
        step++;
    }

    private void bill() {
        System.out.println(step + ".结账");
        step++;
    }

    protected final void goToEat() {
        enter();
        search();
        order();
        eat();
        bill();
        step = 1;
    }
}
