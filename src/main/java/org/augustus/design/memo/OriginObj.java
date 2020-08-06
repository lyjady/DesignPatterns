package org.augustus.design.memo;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/8/6 15:15
 */
public class OriginObj {

    private String state;

    public String getState() {
        return state;
    }

    public OriginObj setState(String state) {
        this.state = state;
        return this;
    }

    public Memo save() {
        return new Memo(this.state);
    }

    public void rollback(Memo memo) {
        this.state = memo.getState();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OriginObj.class.getSimpleName() + "[", "]")
                .add("state='" + state + "'")
                .toString();
    }
}
