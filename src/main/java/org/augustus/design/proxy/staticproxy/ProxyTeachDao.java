package org.augustus.design.proxy.staticproxy;

import org.augustus.design.proxy.ITeachDao;

/**
 * @author LinYongJin
 * @date 2020/7/9 14:38
 */
public class ProxyTeachDao implements ITeachDao {

    private ITeachDao teachDao;

    public ProxyTeachDao(ITeachDao teachDao) {
        this.teachDao = teachDao;
    }

    @Override
    public void teach() {
        System.out.println("before");
        teachDao.teach();
        System.out.println("after");
    }

    @Override
    public String say(String name) {
        System.out.println("before");
        String value = teachDao.say(name);
        System.out.println("say method do");
        System.out.println("after");
        return value;
    }
}
