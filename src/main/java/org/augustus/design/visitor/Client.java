package org.augustus.design.visitor;

/**
 * @author LinYongJin
 * @date 2020/7/24 11:12
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        Success success = new Success();
        objectStructure.display(success);

    }
}
