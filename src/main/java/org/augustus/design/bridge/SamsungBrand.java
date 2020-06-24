package org.augustus.design.bridge;

/**
 * @author LinYongJin
 * @date 2020/6/24 22:45
 */
public class SamsungBrand implements Brand{

    @Override
    public void open() {
        System.out.println("三星手机开机");
    }

    @Override
    public void call() {
        System.out.println("三星手机打电话");
    }

    @Override
    public void close() {
        System.out.println("三星手机关机");
    }
}
