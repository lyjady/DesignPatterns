package org.augustus.design.memo.game;

/**
 * @author LinYongJin
 * @date 2020/8/6 19:51
 */
public class Client {

    public static void main(String[] args) {
        GameRole role = new GameRole(100, 100);
        System.out.println(role);
        Manager manager = new Manager();
        manager.setMemo(role.save());
        role.setAttack(60);
        role.setDefend(60);
        System.out.println(role);
        role.rollback(manager.getMemo());
        System.out.println(role);
    }
}
