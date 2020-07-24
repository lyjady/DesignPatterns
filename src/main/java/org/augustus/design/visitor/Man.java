package org.augustus.design.visitor;

/**
 * @author LinYongJin
 * @date 2020/7/24 11:08
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
