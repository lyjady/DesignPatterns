package org.augustus.design.decorator;

/**
 * @author LinYongJin
 * @date 2020/6/30 10:24
 */
public class Client {

    public static void main(String[] args) {
        Coffee americanCoffee = new AmericanCoffee();
        Seasoning milk = new Chocolate(new Chocolate(new Milk(americanCoffee)));
        System.out.println("one American coffee, one milk, two chocolate price: " + milk.cost());
        System.out.println("==========================================");
        Coffee chineseCoffee = new ChineseCoffee();
        Seasoning chocolate = new Chocolate(new Milk(chineseCoffee));
        System.out.println("one Chinese coffee, one milk, one chocolate price: " + chocolate.cost());
    }
}