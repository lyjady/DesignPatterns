package org.augustus.design.iterator;

import java.util.Iterator;

/**
 * @author LinYongJin
 * @date 2020/7/29 9:59
 */
public interface College {

    String getName();

    Iterator<Department> createIterator();
}
