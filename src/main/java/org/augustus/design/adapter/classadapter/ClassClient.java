package org.augustus.design.adapter.classadapter;

import org.augustus.design.adapter.Phone;
import org.augustus.design.adapter.VoltageAdapter;

/**
 * @author LinYongJin
 * @date 2020/6/20 19:44
 */
public class ClassClient {

    public static void main(String[] args) {
        VoltageAdapter adapter = new VoltageAdapter5V();
        Phone classPhone = new Phone(adapter);
        classPhone.charge();
    }
}
