package jason.designpatterns.command;

/**
 * 调用者
 *
 * @author Jason Hou
 */
public class Invoker {

    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public String invoke() {
        return command.execute();
    }

}
