package org.augustus.design.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/8/6 15:25
 */
public class Manager {

    private final List<Memo> memos = new ArrayList<>();

    public void add(Memo memo) {
        memos.add(memo);
    }

    public Memo load() {
        if (memos.size() > 0) {
            Memo memo = memos.get(memos.size() - 1);
            memos.remove(memo);
            return memo;
        }
        throw new RuntimeException();
    }
}
