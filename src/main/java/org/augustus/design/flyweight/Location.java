package org.augustus.design.flyweight;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/7/9 9:59
 */
public class Location {

    private int row;

    private int column;

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public Location setRow(int row) {
        this.row = row;
        return this;
    }

    public int getColumn() {
        return column;
    }

    public Location setColumn(int column) {
        this.column = column;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ","(", ")")
                .add(String.valueOf(row))
                .add(String.valueOf(column))
                .toString();
    }
}
