package jason.designpatterns.mediator;

/**
 * 具体同事类
 *
 * @author Jason Hou
 */
public class ConcreteColleague2 extends AbstractColleague {

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        getMediator().relay(this);
    }

}
