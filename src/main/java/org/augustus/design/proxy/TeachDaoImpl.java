package org.augustus.design.proxy;

/**
 * @author LinYongJin
 * @date 2020/7/9 14:35
 */
public class TeachDaoImpl implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("theacher teach");
    }

    @Override
    public String say(String name) {
        return "say " + name;
    }
}
