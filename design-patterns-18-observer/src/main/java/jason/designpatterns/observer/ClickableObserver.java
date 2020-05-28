package jason.designpatterns.observer;

/**
 * 观察者接口
 * 抽象观察者，包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用
 *
 * @author Jason Hou
 */
public interface ClickableObserver {

    /**
     * 通知被调用
     *
     * @param clickable 主题
     */
    void clicked(Clickable clickable);

}
