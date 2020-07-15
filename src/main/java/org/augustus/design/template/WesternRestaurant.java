package org.augustus.design.template;

/**
 * @author LinYongJin
 * @date 2020/7/15 10:55
 */
public class WesternRestaurant extends AbstractRestaurant {

    public WesternRestaurant(String name) {
        super(name);
    }

    @Override
    public void order() {
        System.out.println(step + ".点西餐");
        step++;
    }
}
