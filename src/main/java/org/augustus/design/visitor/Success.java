package org.augustus.design.visitor;

/**
 * @author LinYongJin
 * @date 2020/7/24 11:09
 */
public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手成功 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手成功 !");
    }
}
