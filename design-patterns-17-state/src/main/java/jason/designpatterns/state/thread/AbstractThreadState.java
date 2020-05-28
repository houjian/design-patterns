package jason.designpatterns.state.thread;

import jason.designpatterns.state.ThreadContext;

/**
 * 线程状态抽象类
 * 抽象状态
 *
 * @author Jason Hou
 */
public abstract class AbstractThreadState {

    /**
     * 状态名称
     */
    private final String stateName;

    public AbstractThreadState(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    /**
     * 封装环境对象中的特定状态所对应的行为
     *
     * @param context 环境
     */
    public abstract void handle(ThreadContext context);

}
