package org.augustus.design.adapter.objectadapter;

import org.augustus.design.adapter.Phone;
import org.augustus.design.adapter.Voltage220;
import org.augustus.design.adapter.VoltageAdapter;

/**
 * @author LinYongJin
 * @date 2020/6/20 19:48
 */
public class ObjectClient {

    public static void main(String[] args) {
        Voltage220 voltage220 = new Voltage220();
        VoltageAdapter adapter = new VoltageAdapter5V(voltage220);
        Phone phone = new Phone(adapter);
        phone.charge();
    }
}
