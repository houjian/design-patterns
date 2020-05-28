package jason.designpatterns.decorator;

/**
 * 咖啡类
 * 具体构件，通过装饰角色为其添加一些职责
 *
 * @author Jason Hou
 */
public class CoffeeDrink implements Drink {

    @Override
    public String drink() {
        return "喝咖啡";
    }

}
