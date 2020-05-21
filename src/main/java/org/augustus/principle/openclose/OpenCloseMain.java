package org.augustus.principle.openclose;

/**
 * @author LinYongJin
 * @date 2020/5/21 20:19
 */
public class OpenCloseMain {

    /**
     * 开闭原则是指对开发者扩展开放, 对使用者关闭修改.即开发者在原有系统的基础上进行功能的扩展之后, 使用者无需修改原有的代码
     * 只需要直接调用扩展的方法即可.这就要要求开发者遵守依赖倒转原则, 细节依赖抽象
     * 在扩展的时候需要在原有的类的体系中添加相应的实现类或者在已有的类中添加方法, 不要去修改原有的代码可能导致原有功能的错误
     */
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.job(new Square());
        // 此时painter是使用者, 通过抽象类或者接口的方式来设计这个功能, 只需要添加一个实现然后再调用这个实现的方法就可以使用新的功能
        // 无需修改使用者
        painter.job(new Triangle());
    }
}
