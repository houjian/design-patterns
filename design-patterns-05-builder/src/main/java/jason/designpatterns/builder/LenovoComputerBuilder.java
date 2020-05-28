package jason.designpatterns.builder;

/**
 * 联想计算机建造者
 *
 * @author Jason Hou
 */
public class LenovoComputerBuilder extends AbstractComputerBuilder {

    @Override
    public AbstractComputerBuilder cpu() {
        computer.setCpu("I5处理器");
        return this;
    }

    @Override
    public AbstractComputerBuilder display() {
        computer.setDisplay("联想显示器");
        return this;
    }

}
