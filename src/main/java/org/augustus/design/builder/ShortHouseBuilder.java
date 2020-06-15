package org.augustus.design.builder;

/**
 * @author LinYongJin
 * @date 2020/6/15 16:49
 */
public class ShortHouseBuilder implements HouseBuilder{

    private final House house = new House();

    @Override
    public void buildBasic() {
        house.setBasic(10);
        System.out.println("构建ShortHouse地基");
    }

    @Override
    public void buildWall() {
        house.setWall(5);
        System.out.println("构建ShortHouse墙壁");
    }

    @Override
    public void buildHigh() {
        house.setHigh(20);
        System.out.println("构建ShortHouse高度");
    }

    @Override
    public House builder() {
        buildBasic();
        buildWall();
        buildHigh();
        return house;
    }
}
