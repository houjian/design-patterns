package jason.designpatterns.state.thread;

import jason.designpatterns.state.ThreadContext;

/**
 * @author Jason Hou
 */
public class NewThreadState extends AbstractThreadState {

    public static final String STATE_NEW = "新建状态";

    public NewThreadState() {
        super(STATE_NEW);
    }

    @Override
    public void handle(ThreadContext context) {
        AbstractThreadState state = ThreadContext.STATE_RUNNABLE;
        context.setState(state);
        System.out.println(String.format("%s -> %s", getStateName(), state.getStateName()));
    }

}
