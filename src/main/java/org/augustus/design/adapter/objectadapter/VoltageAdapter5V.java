package org.augustus.design.adapter.objectadapter;

import org.augustus.design.adapter.Voltage220;
import org.augustus.design.adapter.VoltageAdapter;

/**
 * @author LinYongJin
 * @date 2020/6/20 19:47
 */
public class VoltageAdapter5V implements VoltageAdapter {

    private Voltage220 voltage220;

    public VoltageAdapter5V(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int adapter() {
        int output = voltage220.output();
        System.out.println("接收输出源电压220V");
        int adapterResult = output / 44;
        System.out.println("适配为" + adapterResult + "V");
        return adapterResult;
    }
}
