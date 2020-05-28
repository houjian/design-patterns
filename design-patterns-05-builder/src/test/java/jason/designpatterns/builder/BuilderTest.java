package jason.designpatterns.builder;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class BuilderTest {

    @Test
    public void testMacComputerBuilder() {
        ComputerDirector director = new ComputerDirector(new MacComputerBuilder());
        Computer computer = director.construct();
        String text = computer.show();
        System.out.println(text);
    }

    @Test
    public void testLenovoComputerBuilder() {
        ComputerDirector director = new ComputerDirector(new LenovoComputerBuilder());
        Computer computer = director.construct();
        String text = computer.show();
        System.out.println(text);
    }

}
