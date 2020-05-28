package jason.designpatterns.proxy.extendz;

/**
 * 真实主题
 * 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
 *
 * @author Jason Hou
 */
public class ClassSubject {

    public String request() {
        return "真实业务";
    }

}
