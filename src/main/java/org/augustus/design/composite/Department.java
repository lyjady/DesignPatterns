package org.augustus.design.composite;

/**
 * @author LinYongJin
 * @date 2020/7/3 11:37
 */
public class Department extends EduOrganization {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public void print() {
        System.out.println("--------------" + this.name + "--------------");
    }
}
