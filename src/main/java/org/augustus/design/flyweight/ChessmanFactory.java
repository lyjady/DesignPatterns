package org.augustus.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LinYongJin
 * @date 2020/7/9 10:04
 */
public class ChessmanFactory {

    private Map<String, Chessman> chessmanMap = new HashMap<>(2);

    public Chessman getChessman(String color) {
        if (chessmanMap.containsKey(color)) {
            return chessmanMap.get(color);
        }
        Chessman chessman = new Chessman(color);
        chessmanMap.put(color, chessman);
        return chessman;
    }

    public int size() {
        return chessmanMap.size();
    }
}
