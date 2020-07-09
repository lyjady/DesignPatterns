package org.augustus.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author LinYongJin
 * @date 2020/7/9 20:40
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        // 设置父类类型
        enhancer.setSuperclass(target.getClass());
        // 设置回调
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (args.length > 0) {
            System.out.print("args: ");
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        System.out.println("before");
        System.out.println(method.getName() + " is call");
        Object value = method.invoke(target, args);
        System.out.println("after");
        return value;
    }
}
