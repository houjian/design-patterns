package jason.designpatterns.builder;

/**
 * Mac计算机建造者
 *
 * @author Jason Hou
 */
public class MacComputerBuilder extends AbstractComputerBuilder {

    @Override
    public AbstractComputerBuilder cpu() {
        computer.setCpu("I7处理器");
        return this;
    }

    @Override
    public AbstractComputerBuilder display() {
        computer.setDisplay("苹果显示器");
        return this;
    }

}
