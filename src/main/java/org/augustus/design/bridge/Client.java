package org.augustus.design.bridge;

/**
 * @author LinYongJin
 * @date 2020/6/24 23:06
 */
public class Client {

    public static void main(String[] args) {
        Brand apple = new AppleBrand();
        AbstractStyle style = new UpRightStyle(apple);
        style.open();
        style.call();
        style.close();
    }
}
