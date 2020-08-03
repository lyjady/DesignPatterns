package org.augustus.design.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author LinYongJin
 * @date 2020/7/29 9:49
 */
public class ComputerIterator implements Iterator<Department> {

    private Department[] departments;

    private int index = 0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public void remove() {
        departments[departments.length - 1] = null;
    }

    @Override
    public void forEachRemaining(Consumer<? super Department> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return index < departments.length;
    }

    @Override
    public Department next() {
        return departments[index++];
    }
}
