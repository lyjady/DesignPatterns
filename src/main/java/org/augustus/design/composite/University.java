package org.augustus.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/7/3 11:05
 */
public class University extends EduOrganization {

    List<EduOrganization> colleges = new ArrayList<>();

    public University(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(EduOrganization college) {
        this.colleges.add(college);
    }

    @Override
    public void remove(int index) {
        colleges.remove(index);
    }

    @Override
    public void print() {
        System.out.println("=================" + this.name + "=================");
        for (EduOrganization college : colleges) {
            college.print();
        }
    }
}
