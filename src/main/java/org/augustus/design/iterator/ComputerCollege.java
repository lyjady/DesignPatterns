package org.augustus.design.iterator;

import java.util.Iterator;

/**
 * @author LinYongJin
 * @date 2020/7/29 10:00
 */
public class ComputerCollege implements College {

    private String name;

    private Department[] departments;

    public ComputerCollege(String name) {
        this.name = name;
        this.departments = new Department[]{new Department("Java"), new Department("大数据"), new Department("PHP")};
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerIterator(departments);
    }
}
