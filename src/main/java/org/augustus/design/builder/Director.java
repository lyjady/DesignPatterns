package org.augustus.design.builder;

/**
 * @author LinYongJin
 * @date 2020/6/15 20:55
 */
public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build() {
        return houseBuilder.builder();
    }
}
