package jason.designpatterns.observer;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        Clickable clickable = new Button();
        clickable.addObserver(new ClickObserver());
        clickable.click();
    }

}