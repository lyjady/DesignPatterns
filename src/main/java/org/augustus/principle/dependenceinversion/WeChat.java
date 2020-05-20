package org.augustus.principle.dependenceinversion;

/**
 * @author LinYongJin
 * @date 2020/5/20 18:49
 */
public class WeChat implements IReceive{
    @Override
    public void receive() {
        System.out.println("WeChat...");
    }
}
