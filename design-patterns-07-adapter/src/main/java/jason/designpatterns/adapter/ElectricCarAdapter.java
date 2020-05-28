package jason.designpatterns.adapter;

/**
 * 适配器
 * 它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者
 *
 * @author Jason Hou
 */
public class ElectricCarAdapter extends ElectricCar implements Car {

    @Override
    public String driver() {
        // 调用适配者的方法，起到接口转换的作用
        return electricDrive();
    }

}
