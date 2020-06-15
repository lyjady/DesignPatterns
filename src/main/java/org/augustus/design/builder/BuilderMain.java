package org.augustus.design.builder;

/**
 * @author LinYongJin
 * @date 2020/6/15 16:54
 */
public class BuilderMain {

    public static void main(String[] args) {
        HouseBuilder shortHouseBuilder = new ShortHouseBuilder();
        House builder = shortHouseBuilder.builder();
        System.out.println(builder);
    }
}
