package org.augustus.design.prototype.deep;

import java.io.*;
import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/6/15 15:27
 */
public class Boy implements Serializable, Cloneable {

    private String name;

    private int age;

    private Father father;

    public String getName() {
        return name;
    }

    public Boy setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Boy setAge(int age) {
        this.age = age;
        return this;
    }

    public Father getFather() {
        return father;
    }

    public Boy() {
    }

    public Boy(String name, int age, Father father) {
        this.name = name;
        this.age = age;
        this.father = father;
    }

    public Boy setFather(Father father) {
        this.father = father;
        return this;
    }

    public Boy deepCopy() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (Boy) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                ois.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected Boy clone() throws CloneNotSupportedException {
        Boy boy = (Boy) super.clone();
        Father clone = boy.father.clone();
        boy.setFather(clone);
        return boy;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Boy.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("father=" + father)
                .toString();
    }
}
