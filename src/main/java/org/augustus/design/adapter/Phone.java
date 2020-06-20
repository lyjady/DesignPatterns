package org.augustus.design.adapter;

import org.augustus.design.adapter.VoltageAdapter;

/**
 * @author LinYongJin
 * @date 2020/6/20 19:42
 */
public class Phone {

    private VoltageAdapter voltageAdapter;

    public Phone(VoltageAdapter voltageAdapter) {
        this.voltageAdapter = voltageAdapter;
    }

    public void charge() {
        int adapter = voltageAdapter.adapter();
        System.out.println("用适配之后的电压" + adapter + "V进行充电");
    }
}
