package org.augustus.principle.dependenceinversion;

/**
 * @author LinYongJin
 * @date 2020/5/20 18:50
 */
public class InversionMain {

    /**
     * 依赖倒转原则
     * 抽象不依赖细节, 细节依赖抽象. 为了程序的扩展性类中的应当去依赖一个接口或者是抽象.
     * 根据多态的特性, 如果依赖一个接口那么只需要传入不同的实现子类就可以调用不同实现子类的方法
     * 依赖的传递分为接口传递与构造方法传递与Setter方法传递
     */
    public static void main(String[] args) {
        People people = new People();
        IReceive email = new Email();
        IReceive weChat = new WeChat();
        people.getUserInfo(email);
        people.getUserInfo(weChat);
    }
}
