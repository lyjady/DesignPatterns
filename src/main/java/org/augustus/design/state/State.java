package org.augustus.design.state;

/**
 * @author LinYongJin
 * @date 2020/8/14 10:45
 */
public abstract class State {


    // 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();

}
