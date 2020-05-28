package jason.designpatterns.adapter;

/**
 * 目标接口
 * 当前系统业务所期待的接口，它可以是抽象类或接口
 * 适配器模式是为了解决接口不匹配的问题，将接口转换成我们期望的接口
 *
 * @author Jason Hou
 */
public interface Car {

    /**
     * 统一汽车启动的方式
     *
     * @return 结果
     */
    String driver();

}
