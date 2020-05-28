package jason.designpatterns.builder;

/**
 * 指挥者
 * 调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息
 *
 * @author Jason Hou
 */
public class ComputerDirector {

    private final AbstractComputerBuilder builder;

    public ComputerDirector(AbstractComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        return builder.cpu().display().getComputer();
    }

}
