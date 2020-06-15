package org.augustus.design.builder;

import org.augustus.principle.interfaceisol.D;

/**
 * @author LinYongJin
 * @date 2020/6/15 16:54
 */
public class BuilderMain {

    public static void main(String[] args) {
        HouseBuilder shortHouseBuilder = new ShortHouseBuilder();
        Director director = new Director(shortHouseBuilder);
        House shortHouse = director.build();
        System.out.println(shortHouse);
    }
}
