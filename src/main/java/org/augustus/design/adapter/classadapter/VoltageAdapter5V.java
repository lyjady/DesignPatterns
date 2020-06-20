package org.augustus.design.adapter.classadapter;

import org.augustus.design.adapter.Voltage220;
import org.augustus.design.adapter.VoltageAdapter;

/**
 * @author LinYongJin
 * @date 2020/6/20 19:32
 */
public class VoltageAdapter5V extends Voltage220 implements VoltageAdapter {

    @Override
    public int adapter() {
        int output = output();
        System.out.println("接收输出源电压220V");
        int adapterResult = output / 44;
        System.out.println("适配为" + adapterResult + "V");
        return adapterResult;
    }
}
