package org.augustus.design.prototype.simple.entry;

import java.io.Closeable;
import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/6/10 15:55
 */
public class Sheep implements Cloneable {

    private String name;

    private String gender;

    private Sheep sheep;

    public Sheep(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Sheep setSheep(Sheep sheep) {
        this.sheep = sheep;
        return this;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public String getName() {
        return name;
    }

    public Sheep setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Sheep setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sheep.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("gender='" + gender + "'")
                .toString();
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep clone = null;
        try {
            clone = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
