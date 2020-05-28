package jason.designpatterns.proxy;

import jason.designpatterns.proxy.extendz.ClassProxy;
import jason.designpatterns.proxy.extendz.ClassSubject;
import jason.designpatterns.proxy.interfaze.InterfaceProxy;
import jason.designpatterns.proxy.interfaze.InterfaceSubject;
import jason.designpatterns.proxy.interfaze.Subject;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class ProxyTest {

    @Test
    public void testInterfaceProxy() {
        Subject proxy = new InterfaceProxy(new InterfaceSubject());
        String result = proxy.request();
        System.out.println(result);
    }

    @Test
    public void testClassProxy() {
        ClassProxy proxy = new ClassProxy(new ClassSubject());
        String result = proxy.request();
        System.out.println(result);
    }

}
