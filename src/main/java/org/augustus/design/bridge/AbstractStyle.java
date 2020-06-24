package org.augustus.design.bridge;

/**
 * @author LinYongJin
 * @date 2020/6/24 22:46
 */
public abstract class AbstractStyle {

    private Brand brand;

    public AbstractStyle(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }

    public void call() {
        this.brand.call();
    }

    public void close() {
        this.brand.close();
    }
}
