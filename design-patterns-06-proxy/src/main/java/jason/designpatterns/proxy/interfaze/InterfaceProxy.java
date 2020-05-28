package jason.designpatterns.proxy.interfaze;

import java.util.Objects;

/**
 * 代理类
 * 与真实主题实现相同接口
 *
 * @author Jason Hou
 */
public class InterfaceProxy implements Subject {

    /**
     * 含有对真实主题的引用
     */
    private final Subject subject;

    public InterfaceProxy(Subject subject) {
        Objects.requireNonNull(subject);
        this.subject = subject;
    }

    private String preRequest() {
        return "[";
    }

    @Override
    public String request() {
        // 对真实主题的业务方法进行增强
        return "接口实现: " + preRequest() + subject.request() + postRequest();
    }

    private String postRequest() {
        return "]";
    }

}
