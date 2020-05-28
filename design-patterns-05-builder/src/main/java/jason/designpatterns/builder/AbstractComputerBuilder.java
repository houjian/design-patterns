package jason.designpatterns.builder;

/**
 * 抽象建造者
 * 好处是将来如果需要新的建者，只需要新增一个子类，不用改原来的代码，符合开闭原则
 *
 * @author Jason Hou
 */
public abstract class AbstractComputerBuilder {

    /**
     * 持有一个产品实例，子类负责装配各个部分
     */
    protected final Computer computer = new Computer();

    /**
     * 子类创建cpu部分
     *
     * @return 返回当前build
     */
    public abstract AbstractComputerBuilder cpu();

    /**
     * 子类创建display部分
     *
     * @return 返回当前build
     */
    public abstract AbstractComputerBuilder display();

    /**
     * 返回最终产品的方法
     *
     * @return 返回产品
     */
    public Computer getComputer() {
        return computer;
    }

}
