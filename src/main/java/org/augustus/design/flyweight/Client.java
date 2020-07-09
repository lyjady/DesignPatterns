package org.augustus.design.flyweight;

/**
 * @author LinYongJin
 * @date 2020/7/9 10:18
 */
public class Client {

    public static void main(String[] args) {
        ChessmanFactory factory = new ChessmanFactory();
        Chessman c1 = factory.getChessman("白");
        c1.action(new Location(1, 2));
        Chessman c2 = factory.getChessman("黑");
        c2.action(new Location(3, 2));
        Chessman c3 = factory.getChessman("白");
        c3.action(new Location(5, 3));
        Chessman c4 = factory.getChessman("黑");
        c4.action(new Location(6, 2));
        System.out.println(factory.size());
    }
}
