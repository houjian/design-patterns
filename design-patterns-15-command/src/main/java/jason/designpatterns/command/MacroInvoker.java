package jason.designpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 调用者
 *
 * @author Jason Hou
 */
public class MacroInvoker {

    private final List<Command> children = new ArrayList<>();

    public void add(Command command) {
        children.add(command);
    }

    public void remove(Command command) {
        children.remove(command);
    }

    public List<String> invoke() {
        return children.stream().map(Command::execute).collect(Collectors.toList());
    }

}
