package jason.designpatterns.mediator;

/**
 * 具体同事类
 *
 * @author Jason Hou
 */
public class ConcreteColleague1 extends AbstractColleague {

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        getMediator().relay(this);
    }

}
