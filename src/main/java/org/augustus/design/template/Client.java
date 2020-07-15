package org.augustus.design.template;

/**
 * @author LinYongJin
 * @date 2020/7/15 10:58
 */
public class Client {

    public static void main(String[] args) {
        AbstractRestaurant chineseRestaurant = new ChineseRestaurant("中餐厅");
        AbstractRestaurant westernRestaurant = new WesternRestaurant("西餐厅");
        chineseRestaurant.goToEat();
        System.out.println("----------------");
        westernRestaurant.goToEat();
    }
}
