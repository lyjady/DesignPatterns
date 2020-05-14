package org.augustus.principle.single;

/**
 * @author LinYongJin
 * @date 2020/5/14 22:33
 */
public class SingleMan {

    /**
     *  为了遵守单一职责原则, 将Transportation分开, 每个类负责各自的职责
     *  一个类只负责一项职责, 提高类的可读性, 可维护性, 降低变更引起的风险
     *  类中方法数量足够少, 可以在方法级别保持单一职责原则(新建Transportation类, 编写三种不同的方法代表三种不同的职责)
     * @param args
     */
    public static void main(String[] args) {
        RoadTransportation road = new RoadTransportation();
        SkyTransportation sky = new SkyTransportation();
        WaterTransportation water = new WaterTransportation();
        road.run("汽车");
        sky.run("飞盖");
        water.run("船");
    }
}
