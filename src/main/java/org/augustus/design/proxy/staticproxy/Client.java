package org.augustus.design.proxy.staticproxy;

import org.augustus.design.proxy.ITeachDao;
import org.augustus.design.proxy.TeachDaoImpl;

/**
 * @author LinYongJin
 * @date 2020/7/9 14:48
 */
public class Client {

    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDaoImpl();
        ProxyTeachDao proxy = new ProxyTeachDao(teachDao);
        proxy.teach();
        System.out.println(proxy.say("Tom"));
    }
}
