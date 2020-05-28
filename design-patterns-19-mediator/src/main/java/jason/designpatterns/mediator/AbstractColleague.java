package jason.designpatterns.mediator;

/**
 * 抽象同事类，保存中介者对象，提供同事对象交互的抽象方法
 *
 * @author Jason Hou
 */
public abstract class AbstractColleague {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    /**
     * 接收消息
     */
    public abstract void receive();

    /**
     * 发送消息
     */
    public abstract void send();

}
