package org.augustus.design.proxy.cglib;

import org.augustus.design.proxy.ITeachDao;
import org.augustus.design.proxy.TeachDaoImpl;

/**
 * @author LinYongJin
 * @date 2020/7/9 20:46
 */
public class Client {

    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDaoImpl();
        ITeachDao proxy = (ITeachDao) new ProxyFactory(teachDao).getProxyInstance();
        proxy.teach();
        System.out.println("----------------");
        System.out.println(proxy.say("CGLib"));
    }
}
