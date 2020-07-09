package org.augustus.design.flyweight;

/**
 * @author LinYongJin
 * @date 2020/7/9 10:02
 */
public class Chessman extends AbstractChessman {

    public Chessman() {
    }

    public Chessman(String color) {
        super(color);
    }

    @Override
    public void action(Location location) {
        System.out.println(super.color + "子在" + location + "位置上落子");
    }
}
