package jason.designpatterns.decorator.flavour;

import jason.designpatterns.decorator.Drink;

/**
 * 牛奶调料
 * 具体装饰，实现抽象装饰的相关方法，并给具体构件对象添加附加的责任
 *
 * @author Jason Hou
 */
public class MilkFlavour extends AbstractFlavour {

    public MilkFlavour(Drink component) {
        super(component);
    }


    private String addMilk() {
        return "加了点牛奶";
    }

    @Override
    public String drink() {
        return addMilk() + "-" + super.drink();
    }

}
