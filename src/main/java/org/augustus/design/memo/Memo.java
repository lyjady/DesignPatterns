package org.augustus.design.memo;

import java.util.StringJoiner;

/**
 * @author LinYongJin
 * @date 2020/8/6 15:22
 */
public class Memo {

    private String state;

    public Memo(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memo setState(String state) {
        this.state = state;
        return this;
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", OriginObj.class.getSimpleName() + "[", "]")
                .add("state='" + state + "'")
                .toString();
    }
}
