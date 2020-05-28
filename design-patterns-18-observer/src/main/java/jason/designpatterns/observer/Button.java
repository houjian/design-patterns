package jason.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 按钮
 * 具体主题
 *
 * @author Jason Hou
 */
public class Button implements Clickable {

    /**
     * 保存观察者对象
     */
    private final List<ClickableObserver> observerList;

    public Button() {
        observerList = new ArrayList<>();
    }

    @Override
    public void click() {
        for (ClickableObserver observer : observerList) {
            observer.clicked(this);
        }
    }

    @Override
    public void addObserver(ClickableObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(ClickableObserver observer) {
        observerList.remove(observer);
    }

}
