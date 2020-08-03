package org.augustus.design.iterator;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/7/29 10:04
 */
public class OutPut {

    private List<College> colleges = new ArrayList<>();

    public OutPut(List<College> colleges) {
        this.colleges = colleges;
    }

    public OutPut() {
    }

    public void addCollege(College college) {
        this.colleges.add(college);
    }

    public void print() {
        for (College college : this.colleges) {
            printDepartment(college);
        }
    }

    private void printDepartment(College college) {
        Iterator<Department> iterator = college.createIterator();
        System.out.println("=======" + college.getName() + "=======");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
