package org.augustus.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/7/29 10:00
 */
public class InformationCollege implements College {

    private String name;

    private List<Department> departments;

    public InformationCollege(String name) {
        this.name = name;
        departments = new ArrayList<>();
        departments.add(new Department("通信工程"));
        departments.add(new Department("电信工程"));
        departments.add(new Department("物联网工程"));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new InformationIterator(departments);
    }
}
