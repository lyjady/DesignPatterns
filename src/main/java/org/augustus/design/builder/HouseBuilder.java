package org.augustus.design.builder;

/**
 * @author LinYongJin
 * @date 2020/6/15 16:48
 */
public interface HouseBuilder {

    void buildBasic();

    void buildWall();

    void buildHigh();

    House builder();
}
