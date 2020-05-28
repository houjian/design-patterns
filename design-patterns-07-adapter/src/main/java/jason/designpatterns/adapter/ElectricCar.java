package jason.designpatterns.adapter;

/**
 * 适配者
 * 已经存在的需要被适配的组件，它的接口不是期望的，需要适配
 *
 * @author Jason Hou
 */
public class ElectricCar {

    /**
     * 被适配的方法
     *
     * @return 结果
     */
    public String electricDrive() {
        return "电动车启动";
    }

}
