package org.augustus.design.state;

/**
 * @author LinYongJin
 * @date 2020/8/14 10:41
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }
}
