package org.augustus.principle.dependenceinversion;

/**
 * @author LinYongJin
 * @date 2020/5/20 18:48
 */
public class Email implements IReceive{
    @Override
    public void receive() {
        System.out.println("email...");
    }
}
