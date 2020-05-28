package jason.designpatterns.decorator;

import jason.designpatterns.decorator.flavour.ChocolateFlavour;
import jason.designpatterns.decorator.flavour.MilkFlavour;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Drink component = new ChocolateFlavour(new MilkFlavour(new CoffeeDrink()));
        String result = component.drink();
        System.out.println(result);
    }

}