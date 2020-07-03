package org.augustus.design.composite;

/**
 * @author LinYongJin
 * @date 2020/7/3 10:45
 */
public abstract class EduOrganization {

    protected String name;

    protected String description;

    public EduOrganization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public EduOrganization setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EduOrganization setDescription(String description) {
        this.description = description;
        return this;
    }

    public void add(EduOrganization college) {
        throw new UnsupportedOperationException();
    }

    public void remove(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
