package org.augustus.design.visitor;

/**
 * @author LinYongJin
 * @date 2020/7/24 11:08
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
