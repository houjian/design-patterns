package jason.designpatterns.decorator.flavour;

import jason.designpatterns.decorator.Drink;

/**
 * 巧克力调料
 * 具体装饰，实现抽象装饰的相关方法，并给具体构件对象添加附加的责任
 *
 * @author Jason Hou
 */
public class ChocolateFlavour extends AbstractFlavour {

    public ChocolateFlavour(Drink component) {
        super(component);
    }

    private String addChocolateFlavour() {
        return "加了点巧克力";
    }

    @Override
    public String drink() {
        return addChocolateFlavour() + "-" + super.drink();
    }

}
