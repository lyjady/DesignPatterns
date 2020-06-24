package org.augustus.design.bridge;

/**
 * @author LinYongJin
 * @date 2020/6/24 22:56
 */
public class UpRightStyle extends AbstractStyle{

    public UpRightStyle(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" 直立样式手机 ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" 直立样式手机 ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" 直立样式手机 ");
    }
}
