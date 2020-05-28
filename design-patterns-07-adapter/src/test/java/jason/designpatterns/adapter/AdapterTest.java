package jason.designpatterns.adapter;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class AdapterTest {

    @Test
    public void testElectricCarAdapter() {
        Car target = new ElectricCarAdapter();
        String result = target.driver();
        System.out.println(result);
    }

    @Test
    public void testGasCarAdapter() {
        Car target = new GasCarAdapter();
        String result = target.driver();
        System.out.println(result);
    }

}
