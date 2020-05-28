package jason.designpatterns.decorator.flavour;

import jason.designpatterns.decorator.Drink;

/**
 * 调料
 * 抽象装饰，实现继承抽象构件
 *
 * @author Jason Hou
 */
public abstract class AbstractFlavour implements Drink {

    /**
     * 并包含具体构件的实例，可以通过其子类扩展具体构件的功能
     */
    private final Drink Component;

    public AbstractFlavour(Drink component) {
        Component = component;
    }

    @Override
    public String drink() {
        return Component.drink();
    }

}
