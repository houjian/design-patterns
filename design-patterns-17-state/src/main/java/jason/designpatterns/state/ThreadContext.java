package jason.designpatterns.state;

import jason.designpatterns.state.thread.*;

/**
 * 线程环境
 * 定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理
 *
 * @author Jason Hou
 */
public class ThreadContext {

    public static final AbstractThreadState STATE_NEW = new NewThreadState();
    public static final AbstractThreadState STATE_RUNNABLE = new RunnableThreadState();
    public static final AbstractThreadState STATE_RUNNING = new RunningThreadState();
    public static final AbstractThreadState STATE_BLOCKED = new BlockedThreadState();
    public static final AbstractThreadState STATE_DEAD = new DeadThreadState();

    private AbstractThreadState state;

    public ThreadContext() {
        this.state = STATE_NEW;
    }

    public void setState(AbstractThreadState state) {
        this.state = state;
    }

    /**
     * 根据状态执行不同操作
     */
    public void handle() {
        state.handle(this);
    }

}
