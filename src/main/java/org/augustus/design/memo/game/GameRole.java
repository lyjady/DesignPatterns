package org.augustus.design.memo.game;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/8/6 19:46
 */
public class GameRole {

    private int attack;

    private int defend;

    public GameRole(int attack, int defend) {
        this.attack = attack;
        this.defend = defend;
    }

    public Memo save() {
        return new Memo(this.attack, this.defend);
    }

    public void rollback(Memo memo) {
        this.attack = memo.getAttack();
        this.defend = memo.getDefend();
    }

    public int getAttack() {
        return attack;
    }

    public GameRole setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public int getDefend() {
        return defend;
    }

    public GameRole setDefend(int defend) {
        this.defend = defend;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GameRole.class.getSimpleName() + "[", "]")
                .add("attack=" + attack)
                .add("defend=" + defend)
                .toString();
    }
}
