package jason.designpatterns.state;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class StateTest {

    @Test
    public void testState() {
        ThreadContext button = new ThreadContext();
        for (int i = 0; i < 8; i++) {
            button.handle();
        }
    }

}
