package jason.designpatterns.state.thread;

import jason.designpatterns.state.ThreadContext;

import java.util.Random;

/**
 * @author Jason Hou
 */
public class RunningThreadState extends AbstractThreadState {

    public static final String STATE_RUNNING = "运行状态";

    public RunningThreadState() {
        super(STATE_RUNNING);
    }

    @Override
    public void handle(ThreadContext context) {
        AbstractThreadState state;
        if (new Random().nextBoolean()) {
            state = ThreadContext.STATE_BLOCKED;
        } else {
            state = ThreadContext.STATE_DEAD;
        }

        context.setState(state);
        System.out.println(String.format("%s -> %s", getStateName(), state.getStateName()));
    }

}
