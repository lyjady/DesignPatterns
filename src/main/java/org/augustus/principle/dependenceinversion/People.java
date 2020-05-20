package org.augustus.principle.dependenceinversion;

/**
 * @author LinYongJin
 * @date 2020/5/20 18:50
 */
public class People {

    public void getUserInfo(IReceive receive) {
        receive.receive();
    }
}
