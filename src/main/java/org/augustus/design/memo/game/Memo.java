package org.augustus.design.memo.game;

/**
 * @author LinYongJin
 * @date 2020/8/6 19:47
 */
public class Memo {

    private int attack;

    private int defend;

    public Memo(int attack, int defend) {
        this.attack = attack;
        this.defend = defend;
    }

    public int getAttack() {
        return attack;
    }

    public Memo setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public int getDefend() {
        return defend;
    }

    public Memo setDefend(int defend) {
        this.defend = defend;
        return this;
    }
}
