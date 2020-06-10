package org.augustus.design.factory.abstractfactory;

import org.augustus.design.factory.entry.Headset;
import org.augustus.design.factory.entry.Phone;

/**
 * @author LinYongJin
 * @date 2020/6/10 11:15
 */
public interface IFactory {

    Phone createPhone();

    Headset createHeadset();
}
