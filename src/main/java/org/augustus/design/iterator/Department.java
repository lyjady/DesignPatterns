package org.augustus.design.iterator;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/7/29 9:49
 */
public class Department {

    public String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Department.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
