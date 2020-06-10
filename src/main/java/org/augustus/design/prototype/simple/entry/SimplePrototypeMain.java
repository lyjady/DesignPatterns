package org.augustus.design.prototype.simple.entry;

/**
 * @author LinYongJin
 * @date 2020/6/10 16:01
 */
public class SimplePrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Jill", "woman");
        Sheep friend = new Sheep("Jack", "man");
        sheep.setSheep(friend);
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        System.out.println(sheep1 + " -> " + sheep1.hashCode() + " -> " + sheep1.getSheep() + " -> " + sheep1.getSheep().hashCode());
        System.out.println(sheep2 + " -> " + sheep2.hashCode() + " -> " + sheep2.getSheep() + " -> " + sheep2.getSheep().hashCode());
        System.out.println(sheep3 + " -> " + sheep3.hashCode() + " -> " + sheep3.getSheep() + " -> " + sheep3.getSheep().hashCode());
        System.out.println(sheep4 + " -> " + sheep4.hashCode() + " -> " + sheep4.getSheep() + " -> " + sheep4.getSheep().hashCode());
    }
}
