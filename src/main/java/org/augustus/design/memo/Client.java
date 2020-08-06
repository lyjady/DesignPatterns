package org.augustus.design.memo;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author LinYongJin
 * @date 2020/8/6 15:28
 */
public class Client {

    public static void main(String[] args) {
        OriginObj obj = new OriginObj();
        Manager manager = new Manager();
        obj.setState("gold 500000");
        manager.add(obj.save());
        System.out.println(obj);

        obj.setState("gold 300000");
        manager.add(obj.save());
        System.out.println(obj);

        obj.setState("gold 100000");
        System.out.println(obj);

        System.out.println("-----------------------");
        obj.rollback(manager.load());
        System.out.println(obj);
        obj.setState("gold 50");
        System.out.println(obj);
        obj.rollback(manager.load());
        System.out.println(obj);
    }
}
