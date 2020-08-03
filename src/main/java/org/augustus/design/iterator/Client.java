package org.augustus.design.iterator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author LinYongJin
 * @date 2020/7/29 10:08
 */
public class Client {

    public static void main(String[] args) {
        College computerCollege = new ComputerCollege("计算机学院");
        College informationCollege = new InformationCollege("信息学院");
        OutPut outPut = new OutPut(Stream.of(computerCollege, informationCollege).collect(Collectors.toList()));
        outPut.print();
    }
}
