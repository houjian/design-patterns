package jason.designpatterns.state.thread;

import jason.designpatterns.state.ThreadContext;

/**
 * @author Jason Hou
 */
public class DeadThreadState extends AbstractThreadState {

    public static final String STATE_DEAD = "死亡状态";

    public DeadThreadState() {
        super(STATE_DEAD);
    }

    @Override
    public void handle(ThreadContext context) {
    }

}
