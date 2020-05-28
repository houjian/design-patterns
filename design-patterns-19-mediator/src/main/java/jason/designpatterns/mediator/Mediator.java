package jason.designpatterns.mediator;

/**
 * 抽象中介者，提供了同事对象注册与转发同事对象信息的抽象方法
 *
 * @author Jason Hou
 */
public interface Mediator {

    /**
     * 注册
     *
     * @param colleague 同事对象
     */
    void register(AbstractColleague colleague);

    /**
     * 转发
     *
     * @param colleague 同事对象
     */
    void relay(AbstractColleague colleague);

}
