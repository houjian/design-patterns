package jason.designpatterns.proxy.extendz;

import java.util.Objects;

/**
 * 代理类
 * 真实对象没有实现接口，作为子类对其进行代理
 *
 * @author Jason Hou
 */
public class ClassProxy extends ClassSubject {

    /**
     * 含有对真实主题的引用
     */
    private final ClassSubject subject;

    public ClassProxy(ClassSubject subject) {
        Objects.requireNonNull(subject);
        this.subject = subject;
    }

    private String preRequest() {
        return "[";
    }

    @Override
    public String request() {
        // 对真实主题的业务方法进行增强
        return "子类实现: " + preRequest() + subject.request() + postRequest();
    }

    private String postRequest() {
        return "]";
    }

}
