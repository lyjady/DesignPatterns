package org.augustus.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author LinYongJin
 * @date 2020/7/9 14:53
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), ((proxy, method, args) -> {
            if (args != null && args.length > 0) {
                System.out.print("args: ");
                for (Object arg : args) {
                    System.out.println(arg);
                }
            }
            System.out.println("before");
            Object value = method.invoke(target, args);
            System.out.println("do " + method.getName() + " method");
            System.out.println("after");
            return value;
        }));
    }
}
