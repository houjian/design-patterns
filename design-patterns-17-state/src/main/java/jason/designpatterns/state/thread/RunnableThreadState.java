package jason.designpatterns.state.thread;

import jason.designpatterns.state.ThreadContext;

/**
 * @author Jason Hou
 */
public class RunnableThreadState extends AbstractThreadState {

    public static final String STATE_RUNNABLE = "就绪状态";

    public RunnableThreadState() {
        super(STATE_RUNNABLE);
    }

    @Override
    public void handle(ThreadContext context) {
        AbstractThreadState state = ThreadContext.STATE_RUNNING;
        context.setState(state);
        System.out.println(String.format("%s -> %s", getStateName(), state.getStateName()));
    }

}
