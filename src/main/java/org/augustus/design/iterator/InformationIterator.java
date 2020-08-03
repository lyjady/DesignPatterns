package org.augustus.design.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author LinYongJin
 * @date 2020/7/29 9:54
 */
public class InformationIterator implements Iterator<Department> {

    private List<Department> departments;

    private int index = 0;

    public InformationIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public void remove() {
        departments.remove(departments.size() - 1);
    }

    @Override
    public void forEachRemaining(Consumer<? super Department> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return index < departments.size() && departments.size() > 0;
    }

    @Override
    public Department next() {
        return departments.get(index++);
    }
}
