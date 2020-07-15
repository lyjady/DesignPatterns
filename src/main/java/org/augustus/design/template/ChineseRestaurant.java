package org.augustus.design.template;

/**
 * @author LinYongJin
 * @date 2020/7/15 10:55
 */
public class ChineseRestaurant extends AbstractRestaurant {

    public ChineseRestaurant(String name) {
        super(name);
    }

    @Override
    public void order() {
        System.out.println(step + ".点中餐");
        step++;
    }
}
