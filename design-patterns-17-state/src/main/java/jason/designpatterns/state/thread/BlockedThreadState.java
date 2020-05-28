package jason.designpatterns.state.thread;

import jason.designpatterns.state.ThreadContext;

/**
 * @author Jason Hou
 */
public class BlockedThreadState extends AbstractThreadState {

    public static final String STATE_BLOCKED = "阻塞状态";

    public BlockedThreadState() {
        super(STATE_BLOCKED);
    }

    @Override
    public void handle(ThreadContext context) {
        AbstractThreadState state = ThreadContext.STATE_RUNNABLE;
        context.setState(state);
        System.out.println(String.format("%s -> %s", getStateName(), state.getStateName()));
    }

}
