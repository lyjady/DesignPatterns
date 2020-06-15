package org.augustus.design.prototype.deep;

import org.augustus.principle.substitution.B;

/**
 * @author LinYongJin
 * @date 2020/6/15 15:31
 */
public class DeepMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Father father = new Father("fa");
        Boy boy = new Boy("bo", 12, father);
        Boy clone = boy.clone();
        System.out.println(boy.hashCode() + " --> " + boy.getFather().hashCode());
        System.out.println(clone.hashCode() + " --> " + clone.getFather().hashCode());
        System.out.println("---------------------------------------------------");
        Boy boy1 = boy.deepCopy();
        System.out.println(boy.hashCode() + " --> " + boy.getFather().hashCode());
        System.out.println(boy1.hashCode() + " --> " + boy1.getFather().hashCode());
    }
}
