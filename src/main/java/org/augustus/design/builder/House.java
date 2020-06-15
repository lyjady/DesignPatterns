package org.augustus.design.builder;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/6/15 16:47
 */
public class House {

    private int basic;

    private int wall;

    private int high;

    public House(int basic, int wall, int high) {
        this.basic = basic;
        this.wall = wall;
        this.high = high;
    }

    public House() {
    }

    public int getBasic() {
        return basic;
    }

    public House setBasic(int basic) {
        this.basic = basic;
        return this;
    }

    public int getWall() {
        return wall;
    }

    public House setWall(int wall) {
        this.wall = wall;
        return this;
    }

    public int getHigh() {
        return high;
    }

    public House setHigh(int high) {
        this.high = high;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", House.class.getSimpleName() + "[", "]")
                .add("basic=" + basic)
                .add("wall=" + wall)
                .add("high=" + high)
                .toString();
    }
}
