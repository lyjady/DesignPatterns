package org.augustus.design.flyweight;

/**
 * @author LinYongJin
 * @date 2020/7/9 9:58
 */
public abstract class AbstractChessman {

    protected String color;

    public AbstractChessman() {
    }

    public AbstractChessman(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public AbstractChessman setColor(String color) {
        this.color = color;
        return this;
    }

    public abstract void action(Location location);
}
