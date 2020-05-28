package jason.designpatterns.observer;

/**
 * 被观察者接口
 * 抽象主题
 *
 * @author Jason Hou
 */
public interface Clickable {

    /**
     * 单击发布
     * 通知所有观察者的抽象方法
     */
    void click();

    /**
     * 添加单击事件的观察者
     *
     * @param observer 观察者
     */
    void addObserver(ClickableObserver observer);

    /**
     * 删除单击事件的观察者
     *
     * @param observer 观察者
     */
    void removeObserver(ClickableObserver observer);

}
