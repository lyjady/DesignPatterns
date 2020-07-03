package org.augustus.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/7/3 11:30
 */
public class College extends EduOrganization {

    List<EduOrganization> departments = new ArrayList<>();

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(EduOrganization college) {
        departments.add(college);
    }

    @Override
    public void remove(int index) {
        departments.remove(index);
    }

    @Override
    public void print() {
        System.out.println("**************" + this.name + "**************");
        for (EduOrganization department : departments) {
            department.print();
        }
    }
}
