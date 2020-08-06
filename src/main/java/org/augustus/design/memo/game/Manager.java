package org.augustus.design.memo.game;

/**
 * @author LinYongJin
 * @date 2020/8/6 19:49
 */
public class Manager {

    private Memo memo;

    public Memo getMemo() {
        return memo;
    }

    public Manager setMemo(Memo memo) {
        this.memo = memo;
        return this;
    }
}
