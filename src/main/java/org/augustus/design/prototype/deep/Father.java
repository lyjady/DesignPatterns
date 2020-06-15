package org.augustus.design.prototype.deep;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/6/15 15:28
 */
public class Father implements Serializable, Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public Father setName(String name) {
        this.name = name;
        return this;
    }

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    @Override
    protected Father clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return (Father) clone;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Father.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
