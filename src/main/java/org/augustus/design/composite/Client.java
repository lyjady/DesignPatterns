package org.augustus.design.composite;

/**
 * @author LinYongJin
 * @date 2020/7/3 11:38
 */
public class Client {

    public static void main(String[] args) {
        EduOrganization university = new University("野鸡大学","野鸡大学");
        EduOrganization college1 = new College("信息工程学院","信息工程学院");
        EduOrganization college2 = new College("数学学院","数学学院");
        university.add(college1);
        university.add(college2);
        EduOrganization department1 = new Department("计算机科学与技术","计算机科学与技术");
        EduOrganization department2 = new Department("信息工程","信息工程");
        EduOrganization department3 = new Department("通信工程","通信工程");
        college1.add(department1);
        college1.add(department2);
        college1.add(department3);
        EduOrganization department4 = new Department("离散数学","离散数学");
        EduOrganization department5 = new Department("高等数学","高等数学");
        college2.add(department4);
        college2.add(department5);
//        university.print();
        college1.print();
    }
}
