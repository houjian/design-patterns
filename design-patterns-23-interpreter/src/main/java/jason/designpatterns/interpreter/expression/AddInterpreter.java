package jason.designpatterns.interpreter.expression;

/**
 * 加法
 *
 * @author Jason Hou
 */
public class AddInterpreter implements Interpreter {

    private final Interpreter first;
    private final Interpreter second;

    public AddInterpreter(Interpreter first, Interpreter second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return first.interpret() + second.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }

}
