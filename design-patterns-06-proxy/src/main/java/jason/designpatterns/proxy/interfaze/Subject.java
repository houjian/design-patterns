package jason.designpatterns.proxy.interfaze;

/**
 * 抽象主题
 * 声明真实主题和代理对象实现的业务方法
 *
 * @author Jason Hou
 */
public interface Subject {

    /**
     * 业务方法
     *
     * @return 结果
     */
    String request();

}
