package org.augustus.design.proxy.dynamicproxy;

import org.augustus.design.proxy.ITeachDao;
import org.augustus.design.proxy.TeachDaoImpl;

/**
 * @author LinYongJin
 * @date 2020/7/9 14:57
 */
public class Client {

    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDaoImpl();
        ProxyFactory factory = new ProxyFactory(teachDao);
        ITeachDao proxy = (ITeachDao) factory.getProxyInstance();
        proxy.teach();
        proxy.say("Sam");
    }
}
