package jason.designpatterns.observer;

/**
 * 具体观察者
 *
 * @author Jason Hou
 */
public class ClickObserver implements ClickableObserver {

    @Override
    public void clicked(Clickable clickable) {
        System.out.println("按钮被点击了");
    }

}
